package lesson210216;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import utils.Time;

public class DeadLockExample2 {

	public static void main(String[] args) {

		Object m1 = new Object();
		Object m2 = new Object();

		Worker h1 = new Worker(m1, m2);
		Worker h2 = new Worker(m2, m1);

		new Thread(h1).start();
		new Thread(h2).start();
	}

}

class Worker implements Runnable {

	Object a, b;
	static Lock lockA = new ReentrantLock();
	static Lock lockB = new ReentrantLock();

	public Worker(Object a, Object b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");
		System.out.println(name + " acquiring first object...");
		lockA.lock();
		try {
			Time.pause(100);
			System.out.println(name + " acquiring second object...");
			try {
				lockB.tryLock(1, TimeUnit.SECONDS);
				try {
					System.out.println(name + " doing claculations...");
					Time.pause(3000);
					System.out.println(name + " finished claculations...");
				} finally {
					lockB.unlock();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} finally {
			lockA.unlock();
		}
	}

}
