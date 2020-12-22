package lesson201222.phonecalls;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneCalls {

	private static Map<String, Person> personsByName;
	private static Map<String, Person> personsByMobile;

	public static void main(String[] args) {
		
		System.out.println("start");

		personsByName = new HashMap<>();
		personsByMobile = new TreeMap<>();

		Person caller = null;
		
		for (int i = 0; i < Generator.NUMBER_OF_PERSONS; i++) {
			Person person = Generator.person();
			Person old = personsByName.put(person.name, person);
			if (i == Generator.NUMBER_OF_PERSONS - 1) {

//			if (old != null) {
//				System.out.println(old);
//			}
			personsByMobile.put(person.mobile, person);
				caller = person;
			}
		}

		System.out.println(personsByName.size());

//		Person caller = personsByName
//				.values()
//				.stream()
//				.findAny()
//				.get();
		
		long start = System.nanoTime();
		Person person = findPersonByNumber(caller
				.mobile);
		long stop = System.nanoTime();
		
		System.out.println("Elapsed: " + (stop - start));

		System.out.println(person);
		System.out.println(person.equals(caller));
	}

	private static Person findPersonByNumber(String number) {
//		for (Person p : personsByName.values()) {
//			if (p.mobile.equals(number)) {
//				return p;
//			}
//		}
		return personsByMobile.get(number);

	}

}
