package lesson210219;

import java.util.concurrent.Semaphore;

import utils.Time;

public class CounterExample {
	public static void main(String[] args) {
		Counter counter = new Counter();
		
		new Thread(() -> {
			while (true) {
				Time.pause(1000);
				counter.inc();
			}
		}).start();
		new Thread(() -> {
			for(;;) {
				Time.pause(1000);
				counter.inc();
			}
		}).start();
		
		while (true) {
			System.out.println(counter.get());
			Time.pause(1000);
		}
	}
}


class Counter {
	int cnt;
	Semaphore s = new Semaphore(1);
	
	int get() {
		s.acquireUninterruptibly();
		try {
			return cnt;
		} finally {
			s.release();
		}
	}
	
	void inc() {
		s.acquireUninterruptibly();
		try {
			cnt++;
		} finally {
			s.release();
		}
	}
}