package ExecuterFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Service implements Callable<String> {
    private final CountDownLatch latch;

    public Service(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try{
            System.out.println(Thread.currentThread().getName()+" Service started");
            Thread.sleep(1000);
        }finally {
            latch.countDown();
        }
        return "Hello";
    }
}

public class CountDownLatchExample {
    public static void main(String[] args) {
        int numberOfService=4;
        ExecutorService executorService= Executors.newFixedThreadPool(numberOfService);
        CountDownLatch latch=new CountDownLatch(numberOfService);
        executorService.submit(new Service(latch));
        executorService.submit(new Service(latch));
        executorService.submit(new Service(latch));
        executorService.submit(new Service(latch));
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("All services completed");
        executorService.shutdown();

    }
}
