package EnumsTutorial;

public enum OrderPriority {
    LOW(4){
        public String getExpectedDelivery(){return String.format("Delivery Expected in %d days ",time);}
    };
//    MEDIUM(3),
//    HIGH(2),
//    URGENT(1);

    final int time;
    OrderPriority(int time){
        this.time=time;
    }

    abstract public String getExpectedDelivery();
    }

