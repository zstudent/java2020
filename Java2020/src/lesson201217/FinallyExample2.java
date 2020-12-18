package lesson201217;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FinallyExample2 {
	
	public static void main(String[] args) {
		
		Lock lock = new ReentrantLock();
		
		lock.lock();
		try { // critical section, mutual exclusion
			// do something important here
		} finally {
			lock.unlock();
		}
		
		System.out.println(m());
		
	}
	
	static String m() {
		
		try {
			System.out.println("m");
			other();
			System.out.println("m2");
			return "hello";
		} catch (Exception e) {
			System.out.println("catch");
			return "hi";
		} finally {
			System.out.println("finally");
//			return "გამაჯობა";
		}
		
	}

	private static void other() {
		System.out.println("other");
		throw new RuntimeException();
	}

}
