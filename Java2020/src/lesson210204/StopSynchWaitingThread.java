package lesson210204;

import utils.Time;

public class StopSynchWaitingThread {

	static long i = 0;

	public static void main(String[] args) {

		System.out.println("start");

		W w = new W();

		synchronized (w) {

			Thread t = new Thread(() -> {
				while (true) {
					w.change();
				}
			});
			t.start();

			Time.pause(3000);

			t.stop();

			System.out.println(w.consistent());
			System.out.println(w.x + " " + w.y);

		}
	}

}

class W {
	int x, y;

	synchronized void change() {
		x++;
		y--;
	}

	boolean consistent() {
		return x + y == 0;
	}
}