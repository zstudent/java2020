package lesson201029;

public class InstanceOf {
	
	public static void main(String[] args) {
		
		String s = "Hello";
		
		check(s);
		
		s = null;
		
		check(s);
		
	}

	private static void check(Object o) {
		System.out.println(o instanceof Object);
		System.out.println(o instanceof String);
		System.out.println(o instanceof CharSequence);
	}

}
