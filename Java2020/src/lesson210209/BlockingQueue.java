package lesson210209;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<T> {

	private Queue<T> items = new LinkedList<>();

	
	public void put(T item) {
		synchronized (items) { // critical section, tasks is the mutex
			items.offer(item);
			items.notify();
		}

	}

	public T take() {
		synchronized (items) {
			while (items.isEmpty()) {
				try {
					items.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return items.poll();
		}
	}

}
