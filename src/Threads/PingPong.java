package Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Game{
    private static boolean isPingTurn=true;

    public synchronized void printPing(){
        while(!isPingTurn){
            try{
                wait();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Ping");
        isPingTurn=false;
        notify();

    }

    public synchronized void printPong(){
        while(isPingTurn){
            try{
                wait();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Pong");
        isPingTurn=true;
        notify();
    }
}

public class PingPong {
    public static void main(String[] args) {

        Game g=new Game();
        Runnable pingThread=new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=5;i++){
                    g.printPing();

                }
            }
        };

        Runnable pongThread=new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=5;i++){
                    g.printPong();

                }
            }
        };

        Thread t1=new Thread(pingThread,"Ping Thread");
        Thread t2=new Thread(pongThread,"Pong Thread");
        t1.start();
        t2.start();
    }
}
