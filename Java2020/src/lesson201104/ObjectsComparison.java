package lesson201104;

public class ObjectsComparison {
	
	public static void main(String[] args) {
		
		Person first = new Person(1999, "Guga");
		Person second = new Person(1999, "Kate");
		Person third = new Person(1999, "Guga");
		
		System.out.println(first == second);
		System.out.println(first.equals(second));
		System.out.println(first.equals(third));
		
	}

}

class Person extends Object {
	public Person(int yearOfBirth, String name) {
		this.yearOfBirth = yearOfBirth;
		this.name = name;
	}
	int yearOfBirth;
	String name;
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person)obj; // type cast (conversion) to Person
		if (this.yearOfBirth != other.yearOfBirth) {
			return false;
		}
		if (!this.name.equals(other.name)) {
			return false;
		}
		return true;
	}
}
