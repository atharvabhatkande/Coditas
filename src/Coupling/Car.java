package Coupling;

class Car {
  private Engine engine;
  public Car(Engine engine){
      this.engine=engine;
  }
    public void drive(){
        System.out.print("Car ");
        engine.start();
        engine.hello();
    }
}
