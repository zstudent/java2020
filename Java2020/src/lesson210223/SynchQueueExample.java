package lesson210223;

import java.util.concurrent.SynchronousQueue;

import utils.Time;

public class SynchQueueExample {
	
	public static void main(String[] args) {
		SynchronousQueue<String> queue = new SynchronousQueue<>();
		new Thread(new Producer(queue)).start();
		new Thread(new Consumer(queue)).start();
		
	}

}


class Producer implements Runnable {
	private SynchronousQueue<String> queue;
	public Producer(SynchronousQueue<String> queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		while (true) {
			Time.pause(1000);
			try {
				queue.put("hello");
				System.err.println("generated hello");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	private SynchronousQueue<String> queue;
	public Consumer(SynchronousQueue<String > queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		while (true) {
			try {
				String string = queue.take();
				Time.pause(3000);
				System.out.println(string);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}