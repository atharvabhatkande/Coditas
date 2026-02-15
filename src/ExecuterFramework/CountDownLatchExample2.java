package ExecuterFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Service2 implements Runnable{
    private final CountDownLatch latch;

    public Service2(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run()  {
        try{
            System.out.println(Thread.currentThread().getName()+" Service started");
            Thread.sleep(1000);
        }catch(Exception e) {

        }finally{
            latch.countDown();
        }
    }
}

public class CountDownLatchExample2 {
    public static void main(String[] args) {
        int numberOfService=4;
        CountDownLatch latch=new CountDownLatch(numberOfService);
        for(int i=1;i<=4;i++){
            new Thread(new Service2(latch)).start();
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("All services completed");

    }
}
