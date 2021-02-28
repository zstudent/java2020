package lesson210212;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BoundedRingBuffer<T> {
	final Lock lock = new ReentrantLock();
	final Condition notFull = lock.newCondition();
	final Condition notEmpty = lock.newCondition();

	final List<T> items;

	public BoundedRingBuffer(int capacity) {
		items = new ArrayList<>(capacity);
	}
	
	int putptr, takeptr, count;

	public void put(T x) throws InterruptedException {
		lock.lock();
		try {
			while (count == items.size())
				notFull.await();
			items.set(putptr, x);
//			if (++putptr == items.size())
//				putptr = 0;
			putptr = (putptr + 1) % items.size();
			++count;
			notEmpty.signal();
		} finally {
			lock.unlock();
		}
	}

	public T take() throws InterruptedException {
		lock.lock();
		try {
			while (count == 0)
				notEmpty.await();
			T x = items.get(takeptr);
			items.set(takeptr, null);
			if (++takeptr == items.size())
				takeptr = 0;
			--count;
			notFull.signal();
			return x;
		} finally {
			lock.unlock();
		}
	}
}