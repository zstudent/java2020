package lesson201211.serialization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable {
	public Person(final String name, final int age, final Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	String name;
	int age;
	transient Address address;
}
