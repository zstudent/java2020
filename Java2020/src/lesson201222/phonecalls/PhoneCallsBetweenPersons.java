package lesson201222.phonecalls;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class PhoneCallsBetweenPersons {
	
	
	public static void main(String[] args) {
		
		
		List<Person> persons = Generator.randomPersons();
		
		Map<Person, List<CallLogRecord>> logsByPerson = Generator.randomPersonsCall(persons);
		
		callsByPerson(persons.get(50), logsByPerson);
	}
	
	
	private static void callsByPerson(Person person, Map<Person, List<CallLogRecord>> logs) {
		
		List<CallLogRecord> callsMadeByPerson = logs.getOrDefault(person, new ArrayList<>());
		
		for (CallLogRecord callLogRecord : callsMadeByPerson) {
			StringBuilder sb = new StringBuilder();
			sb
			.append(callLogRecord.callType)
			.append(" call")
			.append("\n")
			.append("At: ")
			.append(callLogRecord.callDateTime)
			.append("\n");
			
			if ("incoming".equals(callLogRecord.callType)) {
				sb.append("From: ")
				.append(callLogRecord.number)
				.append("\n");
			} else {
				sb.append("To: ")
				.append(callLogRecord.number)
				.append("\n");
			}
			System.out.println(sb);
		}
	}
	
}
