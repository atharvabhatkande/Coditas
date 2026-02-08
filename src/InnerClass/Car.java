package InnerClass;

public class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model){
        this.model=model;
        this.isEngineOn=false;

    }

    class Engine{
        public void start(){
            if(!isEngineOn){
                isEngineOn=true;
                System.out.println(model+"Engine Started");
            }
            else{
                System.out.println("Engine already running");
            }
        }

        public void stop(){
            if(isEngineOn){
                System.out.println("Engine Stopped");
            }
            else{
                System.out.println("Engine already stopped");
            }
        }
    }
}
