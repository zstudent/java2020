package lesson201126;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String s = "examples";
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(7));
//		System.out.println(s.charAt(8));  ERROR!
		
		System.out.println(s.indexOf('a'));
		
		int i = 'a';
		
		System.out.println(i);
		System.out.println(s.indexOf(i));
		System.out.println(s.indexOf(97));
		
		System.out.println(s.indexOf('e', 1));
		
		System.out.println("---");
		
		String dollars = "this is $ sign examples with all $ an a row $$";
		
		printDollars(dollars);

		System.out.println("---");
		printDollars2(dollars);
		
		
	}

	private static void printDollars(String d) {
		for (int i = 0; i < d.length(); i++) {
			if (d.charAt(i) == '$') {
				System.out.println(i);
			}
		}
	}
	
	private static void printDollars2(String d) {
		int i = 0;
		while (i < d.length()) {
			i = d.indexOf('$', i);
			System.out.println(i++);
		}
	}
	
	
	
	

}
