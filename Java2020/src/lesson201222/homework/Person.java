package lesson201222.homework;

import java.util.HashMap;
import java.util.Map;

public class Person implements Comparable<Person>{

    private String name;
    private String mobileNumber;
    private Map<String, Integer> incomingCalls; // Key: Phone number, Value: number of times the calls occurred.
    private Map<String, Integer> outgoingCalls; // same principle here

    public Person(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.incomingCalls = new HashMap<>();
        this.outgoingCalls = new HashMap<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Map<String, Integer> getIncomingCalls() {
        return incomingCalls;
    }

    public void setIncomingCalls(Map<String, Integer> incomingCalls) {
        this.incomingCalls = incomingCalls;
    }

    public Map<String, Integer> getOutgoingCalls() {
        return outgoingCalls;
    }

    public void setOutgoingCalls(Map<String, Integer> outgoingCalls) {
        this.outgoingCalls = outgoingCalls;
    }

    @Override
    public int compareTo(Person o) {
        int nameDiff = this.name.compareTo(o.name);
        return nameDiff == 0 ? this.mobileNumber.compareTo(o.mobileNumber) : nameDiff;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", incomingCalls=" + incomingCalls +
                ", outgoingCalls=" + outgoingCalls +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (o instanceof Person) {
            Person other = (Person) o;
            result = this.compareTo(other) == 0;
        }
        return result;
    }

    public void call(String phoneNumber, Map<String, Integer> calls){
        if (calls.containsKey(phoneNumber)) {
            calls.replace(phoneNumber, calls.get(phoneNumber) + 1);
        } else {
            calls.put(phoneNumber, 1);
        }
    }

    public void printCallHistory(Map<String, Integer> calls){
        System.out.println(calls);
    }

}
