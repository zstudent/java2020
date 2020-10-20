package lesson201020;

public class Scope {
	
	static {
		x = 20;
	}
	
	{
		z = 30;
	}
	
	public static int x = 10; // class field variable

	public int z = 10; // instance field variable
	
	public static void main(String[] args) { // block, method body
		
//		System.out.println(a);  ERROR! out of scope
		
		int a = 10;  // variable declaration with initialization
		
		{  // block
			
			int b = 20;
			
			System.out.println(a);
			System.out.println(b);
			
		}
		
		System.out.println(a);
//		System.out.println(b);   ERROR:  out of scope
		
		
	}
	
}
