package lesson210216;

import utils.Time;

public class DeadLockExample {
	
	public static void main(String[] args) {
		
		Object m1 = new Object();
		Object m2 = new Object();
		
		Holder h1 = new Holder(m1, m2);
//		Holder h2 = new Holder(m2, m1);
		Holder h2 = new Holder(m1, m2);
		
		new Thread(h1).start();
		new Thread(h2).start();
	}

}


class Holder implements Runnable {
	
	Object a, b;
	
	public Holder(Object a, Object b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");
		System.out.println(name + " acquiring first object...");
		synchronized (a) {
			Time.pause(100);
			System.out.println(name + " acquiring second object...");
			synchronized (b) {
				System.out.println(name + " doing claculations...");
				Time.pause(3000);
			}
		}
	}
	
}
