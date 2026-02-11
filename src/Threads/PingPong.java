package Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Game{
    private Lock lock=new ReentrantLock();
    private boolean pingFlag=false;
    private boolean pongFlag=false;

    public void printPing(){


    }

    public void printPong(){

    }
}

public class PingPong {
    public static void main(String[] args) {

        Game g=new Game();
        Runnable pingThread=new Runnable() {
            @Override
            public void run() {
                g.printPing();
            }
        };

        Runnable pongThread=new Runnable() {
            @Override
            public void run() {
                g.printPong();
            }
        };

        Thread t1=new Thread(pingThread,"Ping Thread");
        Thread t2=new Thread(pongThread,"Pong Thread");
        t1.start();
        t2.start();
    }
}
