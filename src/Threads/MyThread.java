package Threads;

public class MyThread extends Thread{

    public MyThread(String message){
        super(message);
    }
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"  Priority: "+Thread.currentThread().getPriority()+"  Count: "+i);
        }

        /*System.out.println("RUNNING State");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }*/

    }
    public static void main(String[] args) throws InterruptedException {
        MyThread t1=new MyThread("Low Priority Thread");
        MyThread t2=new MyThread("Mid Priority Thread");
        MyThread t3=new MyThread("High Priority Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();












       /* MyThread t1=new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        //System.out.println("T1 State: "+t1.getState());
        System.out.println("hello");*/
    }
}
