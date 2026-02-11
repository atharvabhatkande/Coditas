package Threads;

public class Trigger {
    public static void main(String[] args) {
        Account a1=new Account();
        Runnable task=new Runnable() {
            @Override
            public void run() {
                a1.withdraw(500);
            }
        };
        Thread t1=new Thread(task,"Thread1");
        Thread t2=new Thread(task,"Thread2");
        t1.start();
        t2.start();
    }
}
