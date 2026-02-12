package Threads;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class RaceCondition extends Thread {

    static AtomicBoolean flag = new AtomicBoolean(false);
    static AtomicInteger i = new AtomicInteger(1);

    @Override
    public void run() {
        while (!flag.get() && i.get()<=5) {
            int current = i.getAndIncrement();
            if (current > 5) {
                break;
            }

            if (current == 5) {
                if (flag.compareAndSet(false, true)) {
                    System.out.println(Thread.currentThread().getName() + " Count: " + current + " Winner");
                }
                break;
            }
            System.out.println(Thread.currentThread().getName() + " Count: " + current);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }

    public static void main(String[] args) throws InterruptedException {
        RaceCondition t1 = new RaceCondition();
        RaceCondition t2 = new RaceCondition();
        RaceCondition t3 = new RaceCondition();
        t1.start();
        t2.start();
        t3.start();

    }
}