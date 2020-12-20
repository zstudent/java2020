package lesson201218;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable, Comparable<Person> {
	public Person(final String name, final int age, final Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	String name;
	int age;
	transient Address address;
	
	@Override
	public int compareTo(Person o) {
		int names = name.compareTo(o.name);
		if (names == 0) {
			return age - o.age;
		}
		return names;
	}
	
	@Override
	public String toString() {
		return name + " " + age;
	}
}
