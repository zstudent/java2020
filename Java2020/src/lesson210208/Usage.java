package lesson210208;

import utils.Time;

public class Usage {
	
	public static void main(String[] args) {
		
		System.out.println("start");

		Runnable task = () -> 
		System.out.println(Thread.currentThread());
		
//		
//		DirectExecutor de = new DirectExecutor();
//		de.execute(task);
//		
//		new Thread(() -> {
//			de.execute(task);
//		}).start();

		Runnable task1 = () -> 
		System.out.println("one");
		Runnable task2 = () -> 
		System.out.println("two");
		Runnable task3 = () -> 
		System.out.println("three");
		
		WorkerThread1 w = new WorkerThread1();
		w.execute(task1);
		w.execute(task2);
		w.execute(task3);
	}
	
	

}
