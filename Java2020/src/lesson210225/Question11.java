package lesson210225;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import utils.Time;

public class Question11 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Object o1 = new Object();
		Object o2 = new Object();
		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<?> f1 = service.submit(() -> {
			synchronized (o1) {
				Time.pause(100);
				synchronized (o2) {
					System.out.println("Tortoise");
				} // t1
			}
		});
		Future<?> f2 = service.submit(() -> {
			synchronized (o2) {
				Time.pause(100);
				synchronized (o1) {
					System.out.println("Hare");
				} // t2
			}
		});
		f1.get();
		f2.get();
	}

}
