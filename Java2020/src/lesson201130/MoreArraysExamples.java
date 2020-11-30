package lesson201130;

public class MoreArraysExamples {
	
	public static void main(String[] args) {
		
		int[] a = {10, 20, 30};
		
		int[] b;
		
		
		b = new int[] {40, 50, 60};
		
		
		System.out.println(sum(10, 20, 30));
		System.out.println(sum(0,1,2,3,4,5,6,7,8,9));
		
	}

	// varargs
	private static int sum(int... nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

}
