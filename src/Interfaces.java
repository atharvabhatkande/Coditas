import java.lang.reflect.ParameterizedType;

interface Payment{
    void pay();

}

class UPI implements Payment{
    public void pay(){
        System.out.println("Upi Payment Done");
    }
}

class CardPayment implements Payment{
    public void pay(){
        System.out.println("Card payment Done");
    }
}


public class Interfaces {
    public static void main(String [] args){
        UPI upi=new UPI();
        upi.pay();



    }
}
