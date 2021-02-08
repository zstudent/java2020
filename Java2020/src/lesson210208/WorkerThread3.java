package lesson210208;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

public class WorkerThread3 implements Executor {

	Thread t;

	private Queue<Runnable> tasks;

	public WorkerThread3() {
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
		Runnable task = null;
		while (true) {
			synchronized (tasks) {
				while (tasks.isEmpty()) {
					try {
						tasks.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				task = tasks.poll();
			}
			task.run();
		}
	}

}