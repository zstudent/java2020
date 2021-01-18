package lesson210104;

import java.util.function.Function;

public class FunctionExamples {

	public static void main(String[] args) {

		Function<String, Integer> f = s -> s.length();
		Function<String, Integer> f2 = String::length;

		System.out.println(f.apply("hello"));
		System.out.println(f2.apply("hello"));
		
		int i = 10 << 9;   
		
		int j = 10 + 30;   // (add 10 30)
		
		i = -i;

	}

}
