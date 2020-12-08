package lesson201208.hiding;

public class B extends A  {
	
//	public void s() {}  compile error!
	
//	public static void i() {}   compile error!
	
	public static void s() {
		System.out.println("static B");
	}

}
