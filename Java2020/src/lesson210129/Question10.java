package lesson210129;

public class Question10 {
	
	public static void main(String[] args) {
//		CanSprint a = new A();
//		a.walk();
	}

}


interface CanWalk {
	default void walk() { System.out.println("Walking"); }
}

interface CanRun {
	public default void walk() { System.out.println("Walking"); }
	public abstract void run(); 
}

//interface CanSprint extends CanRun, CanWalk {  ERROR!
//	void sprint();
//}

//class A implements CanSprint {
//	
//}