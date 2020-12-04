package lesson201204;

public class Immutability {
	
	public static void main(String[] args) {
		
		Entity e = new Entity(20);
//		e.x = 10; // mutating, not allowed if x is private!
		System.out.println(e.getX());
		
		Thing t = new Thing(30);
		
		System.out.println(t.x);
		
//		t.x = 40; compile error: x is final, can't mutate!
	}

}


class Entity {
	
	public Entity(int initialXvalue) {
		x = initialXvalue;
	}
	
	private int x;  // class member, field, instance variable

	public int getX() {
		return x;
	}
	
}

class Thing {
	
	final public int x;

	public Thing(int inititalXvalue) {
		x = inititalXvalue;
	}
	
	
}