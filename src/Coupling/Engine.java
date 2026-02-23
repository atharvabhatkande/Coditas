package Coupling;

 class Engine implements Vehicle{
     private int cc;
     public Engine(int cc){
         this.cc=cc;
     }

     @Override
     public void start() {
         System.out.println("Engine is starting");
         System.out.println(cc);
     }

     @Override
     public void hello() {
         System.out.println("Hello from Engine");
     }
 }
