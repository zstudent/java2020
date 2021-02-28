package lesson210216;

import utils.Time;

public class RWExampleWithRWL {

	public static void main(String[] args) {

		RWDictionary m = new RWDictionary();

		Runnable read = () -> {
			while (true) {
				Time.pause(100);
				m.get("one");
				Time.pause(1000);
				System.out.println(Thread.currentThread().getName() + " get");
			}
		};

		Runnable write = () -> {
			while (true) {
				Time.pause(500);
				m.put("one", "1");
				Time.pause(1000);
				System.out.println(Thread.currentThread().getName() + " put");
			}
		};

		new Thread(read).start();
		new Thread(read).start();
		new Thread(read).start();
		new Thread(read).start();
		new Thread(read).start();
		new Thread(read).start();
		new Thread(read).start();
		new Thread(write).start();
		new Thread(write).start();

	}

}
