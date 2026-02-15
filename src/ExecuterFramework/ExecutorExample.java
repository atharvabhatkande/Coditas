package ExecuterFramework;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        ExecutorService executor= Executors.newFixedThreadPool(8);
        for(int i=1;i<=10;i++){
            int curr=i;
            executor.submit(()->{
                long res=factorial(curr);
                System.out.println(res);
            });
           // Future<?> future=executor.submit(()-> System.out.println("Hello"));

        }
        executor.shutdown();
        try {
            executor.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Time:"+ (System.currentTimeMillis()-startTime));
    }

    public static long factorial(int n){
        long res=1;
        for(int i=1;i<=n;i++){
            res*=i;
        }
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
        return res;
    }
}
