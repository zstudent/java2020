package homework;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class MyCountDownLatch {
    private AtomicInteger count;
    Semaphore blocker;
    public  MyCountDownLatch(int count){
        this.count = new AtomicInteger(count);
        blocker = new Semaphore(0);
    }

    public void await(){
        if(count.get() > 0)
            blocker.acquireUninterruptibly();
    }

    public void countDown(){
        if(count.decrementAndGet() == 0) {
            blocker.release(2 * blocker.getQueueLength());
        }
    }

    public long getCount(){
        return count.get();
    }
}
