package ExecuterFramework;

public class ManualThreadPool {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        Thread [] threads=new Thread[10];

        for(int i=1;i<=10;i++){
            int curr=i;
            threads[i-1]=new Thread(
                    ()->{
                        long res=factorial(curr);
                        System.out.println(res);
                    }
            );
            threads[i-1].start();
        }
        try{
            for(Thread th: threads){
                th.join();
            }
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Time:"+ (System.currentTimeMillis()-startTime));
    }

    public static long factorial(int n){
        long res=1;
        for(int i=1;i<=n;i++){
            res*=i;
        }
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
        return res;
    }
}
