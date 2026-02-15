package ExecuterFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(2);

        Callable<Integer> callable1=()->{
            System.out.println("Task 1");
            return 1;
        }; Callable<Integer> callable2=()->{
            System.out.println("Task 2");
            return 2;
        }; Callable<Integer> callable3=()->{
            System.out.println("Task 3");
            return 3;
        };

        List<Callable<Integer>> list= Arrays.asList(callable1,callable2,callable3);
        List<Future<Integer>>futures=null;
        try{
            futures=executor.invokeAll(list);
        }catch(Exception e){

        }
        for(Future<Integer> f:futures){
            try{
                System.out.println(f.get());
            }catch (Exception e){

            }
        }

        executor.shutdown();
    }
}
