package lesson210429;

import java.util.ArrayList;
import java.util.List;

final public class Seal {
	final private String name;
	private final List<Seal> friends;

	public Seal(String name, List<Seal> friends) {
		this.name = name;
		this.friends = new ArrayList<>(friends);
	}

	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return
	 */
	public List<Seal> getFriends() {
//		return Collections.unmodifiableList(friends);
		return friends;
	}
}