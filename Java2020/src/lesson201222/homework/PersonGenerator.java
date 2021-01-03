package lesson201222.homework;


import java.util.*;

public class PersonGenerator {

    static final int NUMBER_OF_PERSONS = 50;

    static final Random rnd = new Random();

    static final char[] vowels = {'a', 'o', 'e', 'u', 'i'};
    static final char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j' ,'k'};

    public static final List<Person> people = new ArrayList<>();

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

        return new Person(name.toString(), number.toString());
    }

    public static void main(String[] args) {

        for (int i = 0; i < NUMBER_OF_PERSONS; i++) {
            Person person = person();
            people.add(person);
        }

        for (Person person : people) {
            int quantityOfCalls = 5 + rnd.nextInt(10); // the random quantity of calls for each person
            for(int i = 0; i < quantityOfCalls; i++) {
                int index = rnd.nextInt(people.size()); // random person from list, might
                Person p = people.get(index); // create the instance of the randomly chosen person
                double rand =  Math.random();
                if(rand > 0.5) person.call(p.getMobileNumber(), person.getIncomingCalls()); // save the call in the history
                else person.call(p.getMobileNumber(), person.getOutgoingCalls());
            }
            System.out.println("Call history for " + person.getName());
            // it prints the phone number and the number of times they had a call
            // Call history for jibija
            // {phoneNumber(1), quantityOfCalls(1), phoneNumber(2), quantityOfCalls(2) ... phoneNumber(N), quantityOfCalls(N)}
            System.out.println("Incoming calls: ");
            System.out.println(person.getIncomingCalls());
            System.out.println("Outgoing calls");
            System.out.println(person.getOutgoingCalls());
        }
    }
}
