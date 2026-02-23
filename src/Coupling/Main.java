package Coupling;

public class Main {
    public static void main(String[] args) {

        Car c=new Car(new Engine(1000));
        c.drive();
        Bike b=new Bike(new Engine(125));
        b.drive();
    }
}
