package lesson201222.phonecalls;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Generator {
	
	static final int NUMBER_OF_PERSONS = 1_000;

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


	static List<Person> randomPersons() {
		List<Person> randomPersons = new ArrayList<>(NUMBER_OF_PERSONS);
		
		for (int i = 0; i < NUMBER_OF_PERSONS; i++) {
			randomPersons.add(person());
		}
		return randomPersons;
		
	}
	
	
	static Map<Person, List<CallLogRecord>> randomPersonsCall(List<Person> randomPersons) {
		
		Map<Person, List<CallLogRecord>> logsByRandomPersons = new HashMap<>();
		
		for (int i = 0; i < randomPersons.size(); i++) {
			int callerIndex = rnd.nextInt(NUMBER_OF_PERSONS);
			int recieverIndex = rnd.nextInt(NUMBER_OF_PERSONS);
			//to avoid calling to itself
			while (callerIndex == recieverIndex) {
				recieverIndex = rnd.nextInt(NUMBER_OF_PERSONS);
			}
			Person caller = randomPersons.get(callerIndex);
			Person reciever = randomPersons.get(recieverIndex);
			CallLogRecord callLogCaller = new CallLogRecord(LocalDateTime.now(), reciever.mobile, "outgoing");
			CallLogRecord callLogReciever = new CallLogRecord(LocalDateTime.now(), caller.mobile, "incoming");	
			
			logsByRandomPersons.computeIfAbsent(caller, k -> new ArrayList<CallLogRecord>()).add(callLogCaller);
			logsByRandomPersons.computeIfAbsent(reciever, k -> new ArrayList<CallLogRecord>()).add(callLogReciever);
		}
		
		return logsByRandomPersons;
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
