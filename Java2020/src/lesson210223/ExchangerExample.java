package lesson210223;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerExample {

}

class FillAndEmpty {
	Exchanger<List<String>> exchanger = new Exchanger<List<String>>();
	List<String> initialEmptyBuffer = new ArrayList<>();
	List<String> initialFullBuffer = new ArrayList<>();

	class FillingLoop implements Runnable {
		private static final int N = 3;

		public void run() {
	       List<String> currentBuffer = initialEmptyBuffer;
	       try {
	         while (currentBuffer != null) {
	        	 currentBuffer.add("hello");
	           if (currentBuffer.size() == N)
	             currentBuffer = exchanger.exchange(currentBuffer);
	         }
	       } catch (InterruptedException ex) { }
	     }
	}

	class EmptyingLoop implements Runnable {
		public void run() {
	       List<String> currentBuffer = initialFullBuffer;
	       try {
	         while (!currentBuffer.isEmpty()) {
	        	 System.out.println(currentBuffer.remove(0));
	           if (currentBuffer.isEmpty())
	             currentBuffer = exchanger.exchange(currentBuffer);
	         }
	       } catch (InterruptedException ex) {
	    	   
	       }
	     }
	}

	void start() {
		new Thread(new FillingLoop()).start();
		new Thread(new EmptyingLoop()).start();
	}
}
