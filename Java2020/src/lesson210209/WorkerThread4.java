package lesson210209;

import java.util.concurrent.Executor;

public class WorkerThread4 implements Executor {

	Thread t;

	private BlockingQueue<Runnable> tasks;

	public WorkerThread4() {
		tasks = new BlockingQueue<>();
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