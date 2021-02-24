package lesson210129;

public class Question19 {
	
	public static void main(String[] args) {
		
		Properties.get().serverURL();
	}

}



class P {
	
	String url = Properties.get().serverURL();
	
}