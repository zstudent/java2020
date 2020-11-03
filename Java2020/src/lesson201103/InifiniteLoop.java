package lesson201103;

public class InifiniteLoop {
	
	public static void main(String[] args) {
		
		for (;;) {  // infinite loop
			System.out.println("I am infinite");
		}
		
//		System.out.println("finished");  ERROR: unreachable!
		
	}

}
