package lesson210524.forname;

import java.util.Scanner;

public class App {
	
	private static Message message;

	public static void main(String[] args) throws InterruptedException {
		
		message = new Message() {

			@Override
			public String get() {
				return "easy";
			}
			
		};
		
		new Thread(App::loop).start();
		
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextLine()) {
			String className = scanner.nextLine();
			try {
				Class<?> clazz = Class.forName(className);
				if (Message.class.isAssignableFrom(clazz)) {
					message = (Message) clazz.newInstance();
				}
			} catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		
	}

	private static void loop(){
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(message.get());
		}
	}

}
