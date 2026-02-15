/*
package Threads;
class Paper{
    public synchronized void  paperandpen(Pen pen){
        System.out.println(Thread.currentThread().getName()+" has paper");
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName()+" wants pen");
        pen.penandpaper(this);

    }

}

class Pen{
    public synchronized void penandpaper(Paper paper){
        System.out.println(Thread.currentThread().getName()+" has pen");
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName()+" wants paper");
        paper.paperandpen(this);

    }
}
public class Deadlock{
    public static void main(String[] args) {
        Paper paper=new Paper();
        Pen pen=new Pen();

        Runnable task1=new Runnable() {
            @Override
            public void run() {
                synchronized (pen){
                    paper.paperandpen(pen);
                }
            }
        };

        Runnable task2=new Runnable() {
            @Override
            public void run() {
                pen.penandpaper(paper);
            }
        };

        Thread t1=new Thread(task1);
        Thread t2=new Thread(task2);
        t1.start();
        t2.start();
    }
}*//*

public class PenPaperDeadock {
    public static void main(String[] args) throws InterruptedException {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Runnable hasPenNeedPaper = new Runnable() {

            @Override
            public void run() {
                synchronized(lock1) {
                    System.out.println(Thread.currentThread().getName() + " I have Pen, I need Paper");
                    System.out.println("Gimme Paper I will give you Pen");

                    try { Thread.sleep(50); } catch (InterruptedException e) {}
                    synchronized(lock2){
                        System.out.println("Got Paper, Writing Complete");
                    }
                }
            }

        };

        Runnable hasPaperNeedPen = new Runnable() {

            @Override
            public void run() {
                synchronized(lock2) {
                    System.out.println(Thread.currentThread().getName() + " I have Paper, I need Pen");
                    System.out.println("Gimme Pen, I will give you Paper");

                    try { Thread.sleep(50); } catch (InterruptedException e) {}
                    synchronized(lock1){
                        System.out.println("Got Pen, Writing Complete");
                    }
                }
            }

        };

        Thread t1 = new Thread(hasPenNeedPaper, "Thread-1");
        Thread t2 = new Thread(hasPaperNeedPen, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}

*/
