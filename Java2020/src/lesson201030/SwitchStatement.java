package lesson201030;

public class SwitchStatement {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("give me a number 0-9");
			return;
		}

		int x = Integer.parseInt(args[0]);

		switch (x) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("something between 0 and 4");
			break;

		default:
			System.out.println("unknown digit");
			break;
		}

	}

}
