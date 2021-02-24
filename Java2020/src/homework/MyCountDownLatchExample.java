package homework;


public class MyCountDownLatchExample {
    public static void main(String[] args) {
        MyCountDownLatch mcdl = new MyCountDownLatch(5);
        for(int i = 10; i > 0; i--){
            new Thread(()->{
                    mcdl.await();
                    System.out.println("do something" + Thread.currentThread());
            }).start();
        }
        for(int i = 0; i < 6; i++){
            try {
                Thread.sleep(1000);
                mcdl.countDown();
                System.out.println("iteration #"+(i+1));
                System.out.println("count : "+mcdl.getCount());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for(int i = 10; i > 0; i--){
            new Thread(()->{
                    mcdl.await();
                    System.out.println("do something" + Thread.currentThread());
            }).start();
        }
    }
}
