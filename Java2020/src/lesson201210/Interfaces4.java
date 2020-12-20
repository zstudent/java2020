package lesson201210;

public class Interfaces4 {
	
	private interface I {}
	
	
	public static void main(String[] args) {
		
		Switchable s = new Switchable() {

			@Override
			public void on() {
				// TODO Auto-generated method stub
			}

			@Override
			public void off() {
				// TODO Auto-generated method stub
			}

			@Override
			public boolean isOn() {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		
	}
	

}
