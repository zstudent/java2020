package lesson201030;

public class TernaryExpressionEvaluation {

	public static void main(String[] args) {

		int y = 1;
		int z = 1;
		int x = y < 10 ? y++ : z++;
		System.out.println("y=" + y + " z=" + z);

	}

}
