package lesson201202;

public class Methods {
	
	public static void main(String[] args) {
		
		int[] a = {0, 1, 2, 3};
		
		Methods.print(a);
	}

	public static void print(int[] a) {
		for (int i : a) {
			System.out.println(i);
		}
	}

}
