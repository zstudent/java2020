package lesson201103;

public class BreakFromNestedLoopWithLabel {
	
	public static void main(String[] args) {
		
		int[][] m = {
				{0,1,3},
				{4,5,6,10,12},
				{7},
				{9, 8, 101, 45, 57},
		};
		
		OUTER: for (int i = 0; i < m.length; i++) {
			System.out.print(i + ": ");
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
				if (m[i][j] == 5 ) {
					break OUTER;
				}
			}
			System.out.println();
		}
		System.out.println("finished");
	}

}
