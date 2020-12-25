package lesson201222.phonecalls;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class PhoneCallsBetweenPersons {
	
	
	private static final int NUMBER_OF_PERSONS = 1000;
	
	private static Random rand = new Random();
	
	public static void main(String[] args) {
		
		
		Map<Person, List<CallLog>> logsByPerson = new HashMap<>();
		List<Person> listOfPersons = new ArrayList<>(NUMBER_OF_PERSONS);
		
		for (int i = 0; i < NUMBER_OF_PERSONS; i++) {
			listOfPersons.add(Generator.person());
		}
		
		
		for (int i = 0; i < NUMBER_OF_PERSONS; i++) {
			int callerIndex = rand.nextInt(NUMBER_OF_PERSONS);
			int recieverIndex = rand.nextInt(NUMBER_OF_PERSONS);
			//to avoid calling to itself
			while (callerIndex == recieverIndex) {
				recieverIndex = rand.nextInt(NUMBER_OF_PERSONS);
			}
			Person caller = listOfPersons.get(callerIndex);
			Person reciever = listOfPersons.get(recieverIndex);
			CallLog callLogCaller = new CallLog(LocalDateTime.now(), reciever.mobile, "outgoing");
			CallLog callLogReciever = new CallLog(LocalDateTime.now(), caller.mobile, "incoming");	
			logsByPerson.compute(caller, (person, callLogList) -> {
				if (callLogList == null) return Arrays.asList(callLogCaller);
				List<CallLog> aux = new ArrayList<>(callLogList);
				aux.add(callLogCaller);
				return aux;
			});
			logsByPerson.compute(reciever, (person, callLogList) -> {
				if (callLogList == null) return Arrays.asList(callLogReciever);
				List<CallLog> aux = new ArrayList<>(callLogList);
				aux.add(callLogReciever);
				return aux;
			});
		}
		
		
		//Since we take persons randomly to call each other, first person from the list may not be presented in our call log
		try {
			for (CallLog callLog : logsByPerson.get(listOfPersons.get(1))) {
				System.out.println(callLog.number + " " + callLog.callType);
			}			
		} catch (Exception e) {
			System.out.println("PersonDoesNotExistException: Such person does not exist in our call log");
		}
		
	}

}
