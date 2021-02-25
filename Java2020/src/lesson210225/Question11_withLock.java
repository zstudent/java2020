package lesson210225;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import utils.Time;

public class Question11_withLock {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		System.out.println("start");
		Lock o1 = new ReentrantLock();
		Lock o2 = new ReentrantLock();
		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<?> f1 = service.submit(() -> {
			o1.lock();
			try {
				Time.pause(100);
				while (!o2.tryLock(1, TimeUnit.SECONDS)) {
					System.err.println(Thread.currentThread().getName() + " could not lock");
				}
				try {
					System.out.println("Tortoise");
				} finally {
					o2.unlock();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				o1.unlock();
			}
		});
		Future<?> f2 = service.submit(() -> {
			o2.lock();
			try {
				Time.pause(100);
				while (!o1.tryLock(1, TimeUnit.SECONDS)) {
					System.err.println(Thread.currentThread().getName() + " could not lock");
				}
				try {
					System.out.println("Hare");
				} finally {
					o1.unlock();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				o2.unlock();
			}
		});
		f1.get();
		f2.get();
	}

}
