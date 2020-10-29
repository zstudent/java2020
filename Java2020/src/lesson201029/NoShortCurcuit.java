package lesson201029;

public class NoShortCurcuit {
	
	public static void main(String[] args) {
		
		System.out.println(algorithm1() == 0 & algorithm2() == 0);
		
	}

	private static int algorithm1() {
		int result = Math.random() > 0.2 ? 0 : 1;
		System.out.println(result);
		return result ;
	}

	private static int algorithm2() {
		int result = Math.random() > 0.5 ? 0 : 1;
		System.out.println(result);
		return result ;
	}
	
}
