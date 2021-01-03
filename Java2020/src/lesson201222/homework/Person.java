package lesson201222.homework;

import java.util.HashMap;
import java.util.Map;

public class Person implements Comparable<Person>{

    private String name;
    private String mobileNumber;
    private Map<String, Integer> calls; // Key: Phone number, Value: number of times the calls occurred.

    public Person(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.calls = new HashMap<>();
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

    public Map<String, Integer> getCalls() {
        return calls;
    }

    public void setCalls(Map<String, Integer> calls) {
        this.calls = calls;
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
                ", calls=" + calls +
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

    public void call(String phoneNumber){
        if (calls.containsKey(phoneNumber)) {
            calls.replace(phoneNumber, calls.get(phoneNumber) + 1);
        } else {
            calls.put(phoneNumber, 1);
        }
    }

    public void printCallHistory(){
        System.out.println(calls);
    }

}
