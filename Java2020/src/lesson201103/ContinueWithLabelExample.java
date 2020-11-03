package lesson201103;

public class ContinueWithLabelExample {
	
	public static void main(String[] args) {
		
		int[][] m = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		OUTER: for (int i = 0; i < m.length; i++) {
			System.out.print(i + ": ");
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
				if (m[i][j] % 2 == 0) {
//					break;
					continue OUTER;
				}
			}
			System.out.println();
		}
	}

}
