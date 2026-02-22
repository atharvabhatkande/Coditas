class Shared {
    static volatile boolean flag = false;
}

public class Testt {
    public  static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            while (!Shared.flag) {
                // waiting
            }
            System.out.println(" Flag changed!");
        });

        Thread t2 = new Thread(() -> {
            try { Thread.sleep(1000); } catch (Exception e) {}
            Shared.flag = true;
            System.out.println(" Flag set to true");
        });

        t1.start();
        t2.start();
    }
}
