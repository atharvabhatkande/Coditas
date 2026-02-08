package InnerClassAssignment;

 abstract class SmartDevice{
    abstract void performAction();
}

class Smartcamera extends SmartDevice{
     void performAction(){
         System.out.println("Camera Turned ON");
         Sensor s = new Sensor();
         s.detectMotion();
     }

    private class Sensor{

         void detectMotion(){
             System.out.println("Motion detected in sensor");
         }
    }
}

public class innerclass {

    public static void main(String [] args){
        Smartcamera sc=new Smartcamera();
        sc.performAction();


    }
}
