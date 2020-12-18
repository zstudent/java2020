package lesson201217;

import java.util.Arrays;
import java.util.List;

public class ClassCastExceptionExample {
	
	public static void main(String[] args) {
		
		processStrings(Arrays.asList("one", 10, "three"));
		
	}
	
	
	static void processStrings(List list) {
		for (Object o : list) {
			String s = (String) o;
			String reversed = CommonExceptions.reverse(s);
			System.out.println(reversed);
		}
	}

}
