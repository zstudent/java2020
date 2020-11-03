package lesson201103;

public class ContinueExample {
	
	public static void main(String[] args) {
		
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			if (a[i] % 2 == 0) {
				System.out.println();
				continue;
			}
			System.out.println(a[i] * a[i]);
		}
		
	}

}
