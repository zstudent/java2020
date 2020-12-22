package lesson201222.phonecalls;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
	
	static final int NUMBER_OF_PERSONS = 10_000_000;

	static final Random rnd = new Random();
	
	static final char[] vowels = {'a', 'o', 'e', 'u', 'i'}; 
	static final char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j' ,'k'}; 
	
	static Person person() {
		StringBuilder name = new StringBuilder();
		
		for (int i = 0; i < 3; i++) {
			name.append(consonants[rnd.nextInt(consonants.length)])
			.append(vowels[rnd.nextInt(vowels.length)]);
		}
		
		int age = rnd.nextInt(60) + 10;
		
		StringBuilder number = new StringBuilder();
		for (int i = 0; i < 9; i++) {
			number.append(rnd.nextInt(10));
		}
		
		return new Person(name.toString(), age, number.toString());
	}
	
	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>(NUMBER_OF_PERSONS);
		
		for (int i = 0; i < NUMBER_OF_PERSONS; i++) {
			Person person = person();
			System.out.println(person);
			list.add(person);
		}
		
	}

}
