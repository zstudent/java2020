package lesson201222.phonecalls;

public class Person 
implements Comparable<Person> 
{

	String mobile;
	String name;
	int age;

	public Person(final String name, final int age, String mobile) {
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}

	@Override
	public int compareTo(Person o) {
		int diff = age - o.age;
		if (diff == 0) {
			return name.compareTo(o.name);
		}
		return diff;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) { // guard condition
			return false;
		}
		Person other = (Person) obj;
		return this.compareTo(other) == 0;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override
	public String toString() {
		return name + " " + age + " :  " + mobile;
	}
}
