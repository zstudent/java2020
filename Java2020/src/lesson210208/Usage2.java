package lesson210208;

import utils.Time;

public class Usage2 {
	
	public static void main(String[] args) {
		
		System.out.println("start");

		Runnable task1 = () -> 
		System.out.println("one");
		Runnable task2 = () -> 
		System.out.println("two");
		Runnable task3 = () -> 
		System.out.println("three");
		
		WorkerThread2 w = new WorkerThread2();
		w.execute(task1);
		w.execute(task2);
		w.execute(task3);
	}
	
	

}
