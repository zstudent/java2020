package lesson201030;

public class SwitchAndConstantValues {

	public static void main(String[] args) {

		check("John", "doe");

	}

	private static void check(String firstName, final String secondName) {

		String special = "Sara";
		final String other = "Connor"; 

		//		switch (firstName) {
		//		case "test":  OK
		//		case special:  ERROR
		//		case other:  OK
		//		case secondName:  ERROR
		//		case 5:  ERROR
		//		case 'J':  ERROR
		//	    }

	}

}
