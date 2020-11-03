package lesson201103;

public class BreakFromNestedLoop {
	
	public static void main(String[] args) {
		
		int[][] m = {
				{0,1,3},
				{4,5,6,10,12},
				{7},
				{9, 8, 101, 45, 57},
		};
		
		boolean found = false;
		
		for (int i = 0; !found && i < m.length; i++) {
			System.out.print(i + ": ");
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
				if (m[i][j] == 5 ) {
					found = true;
					break;
				}
			}
			System.out.println();
//			if (found) {
//				break;
//			}
		}
	}

}
