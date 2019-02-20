package by.bntu.fitr.povt.oml.lab10.utill;

public class IdGenerator {

    private static int waiterId;
    private static int customerId;
    private static int orderId;

    public static int getWaiterId(){
        waiterId +=1;
        return  waiterId;
    }

    public static int getCustomerId() {
        customerId +=1;
        return customerId;
    }

    public static int getOrderId() {
        orderId += 1;
        return orderId;
    }
}
