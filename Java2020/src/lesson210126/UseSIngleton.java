package lesson210126;

public class UseSIngleton {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");
		Thread.sleep(3000);
		Singleton.instance();
		Singleton.instance();
	}

}
