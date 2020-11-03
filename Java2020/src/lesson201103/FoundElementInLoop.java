package lesson201103;

public class FoundElementInLoop {
	
	public static void main(String[] args) {
		
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		
		boolean found = false;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 50) {
				System.out.println(a[i]);
				found = true;
				break;
			}
		}
		// if not found - print message
		if (!found) {
			System.out.println("couldn't found the value");
		}

//  Python style:		
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] == 50) {
//				System.out.println(a[i]);
//				break;
//			}
//		} else {
//			System.out.println("couldn't found the value");
//		}
//
		
	}

}
