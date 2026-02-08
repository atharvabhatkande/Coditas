package EnumsTutorial;

public class Enums {
    public static void main(String [] args){
//    DaysOftheWeek day=DaysOftheWeek.SUNDAY;
//    Chocolate choco=Chocolate.KITKAT;

//    if(choco==Chocolate.KITKAT){
//        System.out.println("Yay!");
//    }
//    for(Chocolate c:Chocolate.values()){
//        System.out.println(c+": "+c.superciliousness);
//    }

//      OrderStatus o1=OrderStatus.PLACED;
//        System.out.println(o1.message());

        OrderPriority op=OrderPriority.LOW;
        System.out.println("Priority "+op.time+op.getExpectedDelivery());
    }
}
