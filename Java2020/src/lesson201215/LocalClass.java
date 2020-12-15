package lesson201215;

import java.util.Arrays;
import java.util.List;

public class LocalClass {
	
	public static void main(String[] args) {
		
		Person person = Generator.create("Anna");
		
		System.out.println(person.name());
		
	}

}

interface Person {
	String name();
}


class Generator {
	
	static Person create(String name) {  // name = "Anna"
//		name = "Mike";   ERROR: can't change it
		return new Person() {
			@Override
			public String name() {
//				name = "Mike";   ERROR:  can't change it
				return name;           // LocalPerson.name = name (parameter)
			}
		};
	}
	
	static List<Person> create() {
		
		class LocalPerson implements Person {
			private String name;
			public LocalPerson(String name) {
				this.name = name;
			}
			@Override
			public String name() {
				return name;
			}
		}
		
		return Arrays.asList(new LocalPerson("John"), new LocalPerson("Mark"));
		
		
	}
	
}