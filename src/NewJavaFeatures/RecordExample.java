package NewJavaFeatures;
//record Employee(int id,String firstName,String lastName){}

sealed interface Payment permits UPI, Card {
    void pay();
}

record UPI(String upiId) implements Payment {
    @Override
    public void pay() {

    }
}
record Card(String cardNumber) implements Payment {
    @Override
    public void pay() {

    }
}


public class RecordExample {
    public static void main(String[] args) {
/*        Employee e1=new Employee(100,"Atharva","Bhatkande");
        Employee e2=new Employee(101,"Deep","Patil");
        System.out.println(e1.firstName()+e1.lastName());
        System.out.println(e2.firstName()+e2.lastName());*/
        Payment upi=new UPI("Atha19292");



    }
}
