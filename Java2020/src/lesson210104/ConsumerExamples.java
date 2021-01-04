package lesson210104;

import java.util.function.Consumer;

public class ConsumerExamples {

	public static void main(String[] args) {

		System.out.println(10);

//		Consumer<Integer> c = (Integer i) -> {
//			System.out.println(i);
//		};

		Consumer<Integer> c = i -> System.out.println(i);
		
		Consumer<Integer> c2 = System.out::println;
		
		c.accept(10);

	}

}
