package lesson210223.homework;

import java.util.concurrent.Semaphore;

public class MyCountDownLatch {

    private int counter;
    private Semaphore semaphoreCount;
    private Semaphore semaphoreThread;

    public MyCountDownLatch(int counter) {
        this.counter = counter;
        semaphoreThread = new Semaphore(0);
        semaphoreCount = new Semaphore(1);
    }

    public void await() {
        if (counter > 0)
            semaphoreThread.acquireUninterruptibly();
    }

    public void countDown() {
        semaphoreCount.acquireUninterruptibly();
        counter--;
        if (counter == 0)
            semaphoreThread.release(2 * semaphoreThread.getQueueLength());
        semaphoreCount.release();
    }

    public static void main(String[] args) {

        int counter = 5;

        MyCountDownLatch myCountDownLatch = new MyCountDownLatch(counter);

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                myCountDownLatch.await();
                Time.pause((int) (Math.random() * 1000));
                System.out.println(Thread.currentThread().getName() + " thread is waiting for CountDownLatch");
            }).start();
        }

        for (int i = counter; i > 0; i--) {
            Time.pause(1000);
            myCountDownLatch.countDown();
            System.out.println("CountDownLatch iter # " + (i));
        }

    }

}
