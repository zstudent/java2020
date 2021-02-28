package lesson210211;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorExample1 {
	
	public static void main(String[] args) {
		System.out.println("start");
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		
		service.schedule(() -> {
			System.out.println("three");
		}, 3, TimeUnit.SECONDS);
	
		service.schedule(() -> {
			System.out.println("two");
		}, 2, TimeUnit.SECONDS);
		
		service.schedule(() -> {
			System.out.println("one");
		}, 1, TimeUnit.SECONDS);
		
		service.scheduleAtFixedRate(() -> {
			System.err.println("--");
		}, 0, 1, TimeUnit.SECONDS);
	}

}
