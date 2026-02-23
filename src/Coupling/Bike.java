package Coupling;

public class Bike {
    private Engine engine;
    Bike(Engine engine){
        this.engine=engine;
    }

    void drive(){
        System.out.print("Bike ");
        engine.start();
    }
}
