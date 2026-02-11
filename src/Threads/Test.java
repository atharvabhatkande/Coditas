package Threads;

public class Test extends Thread {
    @Override
    public void run(){

        for(;;){
            System.out.println("Hello");
        }
//        for(int i=0;i<5;i++){
//            System.out.println(Thread.currentThread().getName()+" Is Running ");
//            //Thread.yield();
//        }
    }


    public static void main(String[] args) {
        Test t1=new Test();
            t1.setDaemon(true);
        t1.start();
        System.out.println("Main Done");
        //Test t2=new Test();
        //t2.start();


    }
}
