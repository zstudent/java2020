package lesson201218;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparableExamples {
	
	public static void main(String[] args) {
		
		List<Person> list = new LinkedList<Person>();
		
		Address address = new Address("5-th Avenue", "New York");
		
		list.add(new Person("Mike", 60, address));
		list.add(new Person("Pete", 20, address));
		list.add(new Person("John", 50, address));
		list.add(new Person("Ann", 16, address));
		list.add(new Person("Mike", 21, address));
		list.add(new Person("Jose", 20, address));
		list.add(new Person("Mike",45, address));
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
