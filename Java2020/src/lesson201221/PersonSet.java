package lesson201221;

import java.util.Set;
import java.util.TreeSet;

public class PersonSet {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Mike", 40);
		System.out.println(p1.hashCode());
		Person p2 = new Person("John", 20);
		Person p3 = new Person("Ann", 30);
		Person p4 = new Person("Sarah", 21);
		Person p5 = new Person("Mike", 40);
		System.out.println(p5.hashCode());
		Person p6 = new Person("John", 20);
		Person p7 = new Person("Ann", 30);
		Person p8 = new Person("Sarah", 21);
		
		System.out.println(p1.equals(p5));
		
		Set<Person> persons = new TreeSet<>();
		
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);
		persons.add(p6);
		persons.add(p7);
		persons.add(p8);
		
		System.out.println(persons.size());
		System.out.println(persons);
		
	}

}
