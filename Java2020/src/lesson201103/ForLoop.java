package lesson201103;

public class ForLoop {
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		int j = 0;  // init
		while (j < 10) {  // condition
			System.out.println(j);
			j++; // update
		}
		
		System.out.println();

		int c = 0;

		for (;;) {
			c++;
			if (Math.random() < 0.01) {
				break;
			}
		}
		
		System.out.println(c);
		
	}

}
