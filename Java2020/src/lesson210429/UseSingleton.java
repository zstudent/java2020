package lesson210429;

public class UseSingleton {
	
	public static void main(String[] args) {
//		new Singleton();  Compiler error: constructor is not visible
		
		System.out.println("start");
		
		GoodSingleton gs;
		
		gs = GoodSingleton.instance();
		System.out.println(gs);
		
		gs = GoodSingleton.instance();
		System.out.println(gs);
		
		
	}
	

}
