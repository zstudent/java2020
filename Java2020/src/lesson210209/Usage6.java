package lesson210209;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import utils.Time;

public class Usage6 {
	
	public static void main(String[] args) {
		
		System.out.println("start");

		Runnable task1 = () -> 
		System.out.println("one");
		Runnable task2 = () -> 
		System.out.println("two");
		Runnable task3 = () -> 
		System.out.println("three");
		
		Executor w = Executors.newSingleThreadExecutor();
		System.out.println(w.getClass());
		Time.pause(1000);
		w.execute(task1);
		Time.pause(1000);
		w.execute(task2);
		Time.pause(1000);
		w.execute(task3);
	}
	
	

}
