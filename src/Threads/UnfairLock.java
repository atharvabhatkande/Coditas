package Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLock {
    private Lock unfairLock=new ReentrantLock();
    //private Lock unfairLock=new ReentrantLock(true);  to maintain the fairness

    public void accessResource(){
        unfairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+ "Acquired the lock");
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println(e);
        }finally {
            unfairLock.unlock();
            System.out.println(Thread.currentThread().getName()+" Released the lock");
        }
    }

    public static void main(String[] args) {
        UnfairLock ul=new UnfairLock();
        Runnable task=new Runnable() {
            @Override
            public void run() {
                ul.accessResource();
            }
        };
        Thread t1=new Thread(task,"Thread 1");
        Thread t2=new Thread(task,"Thread 2");
        Thread t3=new Thread(task,"Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
