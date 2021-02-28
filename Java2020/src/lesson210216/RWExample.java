package lesson210216;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import utils.Time;

public class RWExample {

	public static void main(String[] args) {

		Map<String, String> m = new HashMap<>();
		Lock lock = new ReentrantLock();

		Runnable read = () -> {
			while (true) {
				Time.pause(100);
				lock.lock();
				try {
					m.get("one");
					Time.pause(1000);
					System.out.println(Thread.currentThread().getName() + " get");
				} finally {
					lock.unlock();
				}
			}
		};

		Runnable write = () -> {
			while (true) {
				Thread.yield();
				lock.lock();
				try {
					m.put("one", "1");
					Time.pause(1000);
					System.out.println(Thread.currentThread().getName() + " put");
				} finally {
					lock.unlock();
				}
			}
		};
		
		new Thread(read).start();
		new Thread(read).start();
		new Thread(read).start();
		new Thread(read).start();
		new Thread(read).start();
		new Thread(read).start();
		new Thread(read).start();
		new Thread(write).start();
		new Thread(write).start();

	}

}
