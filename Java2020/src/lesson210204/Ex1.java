package lesson210204;


public class Ex1 {

	public static void main(String[] args) {
		
		B b = new B();
		
		new Thread(()-> {
			b.m();
		}).start();
		
		new Thread(()-> {
			b.n();
		}).start();
	}
	
	static void pause() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


class A {
	synchronized void m() {  //  A.class    this
		System.out.println("A+");
		Ex1.pause();
		System.out.println("A-");
	}
}

class B extends A {
	synchronized void n() {  //  B.class   this
		System.out.println("B+");
		Ex1.pause();
		System.out.println("B-");
	}
}
