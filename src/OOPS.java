class Account{
    private double balance;

    public void deposit(double amount){
        balance+=amount;
    }

    public double getBalance(){
        return balance;
    }

}

public class OOPS {
    public static void main(String [] args){
            Account ac1=new Account();
            ac1.deposit(1000);
            ac1.deposit(2000);
        System.out.println("Balance : "+ac1.getBalance());
    }
}
