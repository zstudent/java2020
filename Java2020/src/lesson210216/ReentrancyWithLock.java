package lesson210216;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import utils.Time;

public class ReentrancyWithLock {
	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.m1();
		
	}

}



class B {
	
	Lock lock = new ReentrantLock();
	
	void m1() {
		lock.lock();
		try {
			System.out.println("m1");
			m2();
		} finally {
			lock.unlock();
		}
		
	}
	void m2() {
		lock.lock();
		try {
			System.out.println("m2");
		} finally {
			lock.unlock();
		}
	}
	
}