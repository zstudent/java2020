package homework;

import utils.Time;

import java.util.concurrent.Semaphore;

public class CountDownLatch {

    private int count;
    private final Semaphore semaphore;

    public CountDownLatch(int count) {
        this.count = count;
        semaphore = new Semaphore(0);
    }

    public void await() throws InterruptedException {
        if (Thread.interrupted())
            throw new InterruptedException();
        if (count > 0) {
            semaphore.acquire();
        }
    }

    public void countDown() {
        if (--count == 0) {
            semaphore.release(semaphore.getQueueLength());
        }
    }

    public long getCount() {
        return count;
    }

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(3);

        Runnable task = () -> {
            try {
                System.err.println(Thread.currentThread().getName() + " starting to await...");
                latch.await();
                System.err.println(Thread.currentThread().getName() + " got it!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();

        Time.pause(3000);
        System.out.println("first");
        latch.countDown();

        Time.pause(3000);
        System.out.println("second");
        latch.countDown();
    }
}
