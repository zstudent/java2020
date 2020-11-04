package lesson201104;

public class StringsAndEquals {
	
	public static void main(String[] args) {
		
		String s1 = "hello";
		
		String s2 = "hello";
		
		System.out.println(s1 == s2);  // true because of String intern mechanism
		System.out.println(s1.equals(s2));
		
		String s3 = new String("hello");
		
		System.out.println(s1 == s3);  // false 
		System.out.println(s1.equals(s3)); // true - equal value
		
		System.out.println(new Object());
		System.out.println(new Object().toString());
	}

}
