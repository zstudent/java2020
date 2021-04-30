package lesson210429;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseSeal {
	
	public static void main(String[] args) {
		
		List<Seal> friends = new ArrayList<>();
		
		Seal seal = new Seal("main", friends);
		System.out.println(seal.getFriends());
		
		
		Seal other = new Seal("other", Collections.emptyList());
//		seal.getFriends().add(other);
		
//		System.out.println(seal.getFriends());
		
		friends.add(other);
		
		System.out.println(seal.getFriends());
	}

}
