package lesson210209.executors;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import utils.Time;

public class ExecutorsExamples1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable task = () -> {
			System.out.println("hello");
			Time.pause(3000);
			System.out.println("good bye");
		};
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		for (int i = 0; i < 10; i++) {
			service.execute(task);
		}
		
		Time.pause(2000);
		
//		service.shutdown();
		List<Runnable> notExecutedTasks = service.shutdownNow();
		System.err.println(notExecutedTasks);
		
//		Time.pause(10000);
//		System.err.println(service.isShutdown());
		
		service.awaitTermination(1, TimeUnit.MINUTES);
		
		System.err.println("finish");
		
	}

}
