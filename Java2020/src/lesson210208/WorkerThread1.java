package lesson210208;

import java.util.concurrent.Executor;

public class WorkerThread1 implements Executor {

	Thread t;

	private volatile Runnable task;

	public WorkerThread1() {
		t = new Thread(this::loop);
		t.start();
	}

	@Override
	public void execute(Runnable command) {
		if (task == null) 
			task = command;  // main thread runs this line
	}

	private void loop() { // Runnable functional descriptor () -> void
		while (true) {
			if (task != null) {
				task.run();
				task = null;
			}
		}
	}

}