package lesson201103;

public class FoundElementInLoopWithLabel {
	
	public static void main(String[] args) {
		
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		
		BLOCK: {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == 5) {
					System.out.println(a[i]);
					break BLOCK;
				}
			}
			System.out.println("finished loop");
		}

		
	}

}
