package lesson201030;

public class IfStatement {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Usage: <program name> <param>");
			return; // System.exit(0)
		}

		if ("one".equals(args[0])) {
			System.out.println(1);
		} else if ("two".equals(args[0])) {
			System.out.println(2);
		} else if ("three".equals(args[0])) {
			System.out.println(3);
		} else if ("four".equals(args[0])) {
			System.out.println(4);
		} else if ("five".equals(args[0])) {
			System.out.println(5);
		} else {
			System.out.println("not digit");
		}


	}

}
