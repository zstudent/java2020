package lesson210211;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import utils.Time;

public class ScheduledExecutorExample2 {
	
	public static void main(String[] args) {
		System.out.println("start");
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(3);
		
//		service.scheduleAtFixedRate(new Task(), 0, 1, TimeUnit.SECONDS);
		service.scheduleWithFixedDelay(new Task(), 0, 5, TimeUnit.SECONDS);
	}

}


class Task implements Runnable {
	
	int n;

	@Override
	public void run() {
		n++;
		System.out.println("begin " + n);
		Time.pause(3000);
		System.out.println("end " + n);
	}
	
}