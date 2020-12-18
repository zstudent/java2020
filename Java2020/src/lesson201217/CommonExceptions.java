package lesson201217;

public class CommonExceptions {
	
	static String input;
	
	public static void main(String[] args) {
		
		if (args.length == 0) {
			System.out.println("Usage: expected param <string-to-revert>");
			return;
		}
		
//		System.out.println(args.length);
		
		input = args[0];
		
//		String reversed = reverse("hello");
//		System.out.println(reversed);
		
		System.out.println(reverse(input));
	}

	static String reverse(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

}
