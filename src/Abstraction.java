abstract class Vehicle{
    abstract void start();

    void engine(){
        System.out.println("Vehicle Engine");
    }
}

class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Car is starting");
    }
}
public class Abstraction {
    public static void main(String [] args){
        Car c=new Car();
        c.start();
        c.engine();
    }
}
