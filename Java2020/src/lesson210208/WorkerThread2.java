package lesson210208;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

public class WorkerThread2 implements Executor {

	Thread t;

	private volatile Queue<Runnable> tasks;

	public WorkerThread2() {
		tasks = new LinkedList<>();
		t = new Thread(this::loop);
		t.start();
	}

	@Override
	public void execute(Runnable command) {
		synchronized (tasks) { // critical section, tasks is the mutex
			tasks.offer(command);
			tasks.notify();
		}
	}

	private void loop() { // Runnable functional descriptor () -> void
		while (true) {

			while (tasks.isEmpty()) { // busy loop
				Runnable task = null;
				synchronized (tasks) {
					try {
						tasks.wait();
						task = tasks.poll();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (task != null) {
					task.run();
				}
			}
		}
	}

}