package lesson210524;

public class User {
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public User() {
	}

	int id;
	String name;
	
	@Override
	public String toString() {
		return id + ", " + name;
	}

}
