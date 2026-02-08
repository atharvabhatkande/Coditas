package EnumsTutorial;

public enum OrderStatus {
    PLACED{
        public String message(){ return "Order Placed Successfully";}
    },
    SHIPPED{
        public String message(){return "Order Shipped";}
    },
    DELIVERED{
        public String message(){return "Order Delivered";}
    },
    CANCELLED{
        public String message(){return "Order Cancelled";}
    };

    abstract public String message();
}
