package lesson201021;

public class InitSequence {
	
	static {
		System.out.println("static");
	}
	
	static void helper() {
		System.out.println("helper");
	}
	
	static int x;
	
	{
		System.out.println("instance");
	}
	
	public InitSequence() {
		System.out.println("constructor");
	}
	
	static {
		System.out.println("static 2");
	}

}
