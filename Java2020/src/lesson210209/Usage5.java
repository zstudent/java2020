package lesson210209;

import utils.Time;

public class Usage5 {
	
	public static void main(String[] args) {
		
		System.out.println("start");

		Runnable task1 = () -> 
		System.out.println("one");
		Runnable task2 = () -> 
		System.out.println("two");
		Runnable task3 = () -> 
		System.out.println("three");
		
		WorkerThread5 w = new WorkerThread5();
		Time.pause(1000);
		w.execute(task1);
		Time.pause(1000);
		w.execute(task2);
		Time.pause(1000);
		w.execute(task3);
	}
	
	

}
