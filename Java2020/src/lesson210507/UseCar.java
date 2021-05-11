package lesson210507;

public class UseCar {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.setEngine(new Engine());
		car.move();
		car.setEngine(new Engine() {
			@Override
			public void start() {
				System.out.println("whhheeeee");
			}
		});
		car.move();
		
	}

}
