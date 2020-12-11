package lesson201211;

public class Immutables {

	public static void main(final String[] args) {
		
		final Immutable im = new Immutable(10);
		System.out.println(im.getX());
	}
	
}


class Immutable {
	private final int x; 
	public Immutable(final int x) {
		this.x = x;
	}
	int getX() {
		return x;
	}
}
