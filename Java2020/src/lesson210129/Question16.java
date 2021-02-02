package lesson210129;

public class Question16 {
	
	public static void main(String[] args) {
		
		int chew = Herbivore.chew();
		
		System.out.println(chew);
	}

}

interface Herbivore {
	int amount = 10;

	public static void eatGrass() {}

	public static int chew() {
		return 13;
	}
}