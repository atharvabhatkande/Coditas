 abstract class Coditas{
    abstract void java();
}

class Java extends Coditas{
    void java(){
        System.out.println("Learning Java");
    }
}

class Atharva{
    void print(){
        System.out.println("My name is Atharva");
    }
}

public class Anonymous {
    public static void main(String [] args){
        Java j=new Java();
        j.java();

        Coditas c=new Coditas(){
            void java(){
                System.out.println("Learning java in coditas");

            }
        };
        c.java();

        Atharva a =new Atharva();
        a.print();

        Atharva a2=new Atharva(){
            void print(){
                System.out.println("I work in Coditas");
            }

        };

        a2.print();


    }
}

//Changes from github repo
