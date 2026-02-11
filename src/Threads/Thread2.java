package Threads;

public class Thread2  extends Thread{
    @Override
    public void run(){
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
