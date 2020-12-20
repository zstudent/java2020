package lesson201211;

import java.util.Arrays;
import java.util.List;

public class UseSingleton {

	public static void main(final String[] args) {
		
		final List<Singleton> list = Arrays.asList(Singleton.instance(), Singleton.instance());
		
		System.out.println(list);
		
		
	}
	
}
