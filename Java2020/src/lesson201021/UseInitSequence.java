package lesson201021;

public class UseInitSequence {
	
	public static void main(String[] args) {
		InitSequence is;
		System.out.println(InitSequence.x);
		InitSequence.helper();
		
		new InitSequence();
		
		InitSequence.helper();
		
	}

}
