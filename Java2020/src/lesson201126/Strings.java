package lesson201126;

public class Strings {
	
	public static void main(String[] args) {
		System.out.println(1 + 2);
		System.out.println("a" + "b");  // concatenation, glue strings
		System.out.println("a" + "b" + 3);  
		System.out.println(1 + 2 + "a");  
		System.out.println("a" + 1 + 2);  
		System.out.println("a" + (1 + 2));
		
		String s = "";
		for (int i = 0; i <= 9; i++) {
			s += i;
		}
		System.out.println(s);
	}

}

//   s  -x->   ""
//   s  -x->   "0"
//   s  -x->   "01"
//   s  -x->   "012"
//   s  -x->   "0123"
//   s  -x->   "01234"
//   s  -x->   "012345"
//   s  -x->   "0123456"
//   s  -x->   "01234567"
//   s  -x->   "012345678"
//   s  --->   "0123456789"
