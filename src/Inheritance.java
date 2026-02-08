interface Camera{
    void takePhoto();
}

interface Phone{
    void makeCall();
}

class SmartPhone implements Camera,Phone{
    public void takePhoto(){
        System.out.println("Click");
    }

    public void makeCall(){
        System.out.println("Calling");
    }
}


public class Inheritance {
    public static void main(String [] args){
        SmartPhone s=new SmartPhone();
        s.makeCall();
        s.takePhoto();
    }
}
