package lesson210216;

import utils.Time;

public class ReentrancyWithSynchronized {
	
	public static void main(String[] args) {
		
		A a = new A();
		
		a.m1();
		
	}

}



class A {
	
	synchronized void m1() {
		System.out.println("m1");
		m2();
	}
	synchronized void m2() {
		System.out.println("m2");
		Time.pause(30000);
	}
	
}