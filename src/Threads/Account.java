package Threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private int balance=1000;
    private final Lock lock= new ReentrantLock();

    public  void withdraw(int amount) {
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance<amount){
                    System.out.println(Thread.currentThread().getName()+" Insufficient Balance");
                }
                else{
                    System.out.println(Thread.currentThread().getName()+" Proceeding with Withdrawal");
                    try{
                        Thread.sleep(3000);
                    }catch(Exception e){
                        System.out.println(e);
                    }finally {
                        lock.unlock();
                    }
                    balance-=amount;
                    System.out.println(Thread.currentThread().getName()+" Transaction Completed Remaining Balance: "+balance);
                }
            }else{
                System.out.println(Thread.currentThread().getName()+" Could not acquire the lock");
            }
        }catch(Exception e){
            System.out.println(e);
        }



    }
}
