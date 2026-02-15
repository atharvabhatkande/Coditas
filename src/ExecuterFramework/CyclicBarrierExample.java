package ExecuterFramework;

import java.util.concurrent.CyclicBarrier;

class WebBrowser implements Runnable{
    private String name;
    private CyclicBarrier barrier;

    public WebBrowser(String name, CyclicBarrier barrier) {
        this.name = name;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try{
            System.out.println(name+ "Initialization started");
            Thread.sleep(1000);
            System.out.println(name+ "Initialization completed");
            barrier.await();
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier barrier=new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {
                System.out.println("All services are up");
            }
        });

        Thread t1=new Thread(new WebBrowser("Web service",barrier));
        Thread t2=new Thread(new WebBrowser("Database",barrier));
        Thread t3=new Thread(new WebBrowser("Message Service",barrier));
        t1.start();
        t2.start();
        t3.start();
        barrier.reset();

      /*  Thread t4=new Thread(new WebBrowser("Web Browser running",barrier));
        t4.start();

        barrier.reset();
*/

    }
}
