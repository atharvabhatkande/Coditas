    package InnerClass;

    public class Test {
        public static void main(String [] args){

    //        Car c= new Car("Mahindra KUV");
    //        Car.Engine engine= c.new Engine();
    //        engine.start();
    //        engine.stop();

            Computer comp=new Computer("HP","Victus","Windows");
            comp.getOs().display();
        }

    }
