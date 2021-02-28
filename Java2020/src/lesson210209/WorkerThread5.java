package lesson210209;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class WorkerThread5 implements Executor {

	Thread t;

	private BlockingQueue<Runnable> tasks = new LinkedBlockingQueue<>();

	public WorkerThread5() {
		t = new Thread(this::loop);
		t.start();
	}

	@Override
	public void execute(Runnable command) {
		try {
			tasks.put(command);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void loop() { // Runnable functional descriptor () -> void
		while (true) {
			try {
				tasks.take().run();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}