package lesson201103;

public class MoreForExamples {
	
	public static void main(String[] args) {
		
		int x = Integer.MAX_VALUE;
		
		for(;x > 0;) {
			System.out.println(x /= 2);
		}
		
		for(int j = 0, k = 0; j < 10; j++, k++) {
			System.out.println(j + " " + k);
		}
		
		for(int j = 0, k = 0; j < 10; j++, k++) {
			System.out.println(j + " " + k);
		}
		
//		System.out.println(j);  ERROR:  out of scope of j
		
		
//		
//		for (int i = 0;;i++) {
//			if (i % 1000000 == 0) {
//				System.out.println(i);
//			}
//		}
		
	}

}
