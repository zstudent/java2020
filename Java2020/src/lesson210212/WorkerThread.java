package lesson210212;

import java.util.concurrent.Executor;

public class WorkerThread implements Executor {

	Thread t;

	private BlockingQueue<Runnable> tasks = new BlockingQueue<>();

	public WorkerThread() {
		t = new Thread(this::loop);
		t.start();
	}

	@Override
	public void execute(Runnable command) {
		tasks.put(command);
	}

	private void loop() { // Runnable functional descriptor () -> void
		while (true) {
			tasks.take().run();
		}
	}

}