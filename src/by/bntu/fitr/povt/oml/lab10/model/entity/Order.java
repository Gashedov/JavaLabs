package by.bntu.fitr.povt.oml.lab10.model.entity;

import org.apache.log4j.Logger;

public class Order {

    private int id;
    private OrderStatus status;
    private int waiterId;
    private int customerId;
    private int price;

    private static int idCounter = 1;

    {
        this.id = idCounter++ ;
        this.status = OrderStatus.OPENED;
    }

    Order(int customerId, int price){
        this.customerId = customerId;
        this.price = price;

    }

    Order(){
    }

    public void setWaiter(int id){
        this.waiterId = id;
    }

    public void setStatus(String st) {
        try {
            this.status = OrderStatus.valueOf(st);
            logger.info ("result: Status setted");
        }
        catch (IllegalArgumentException illegalArgumentException){
            System.out.println("Incorrect status argument");
            logger.fatal("Incorrect status argument");
        }
        catch (NullPointerException nullPointException){
            System.out.println("No status argument");
            logger.fatal(nullPointException.getMessage(), nullPointException);
        }
    }

    public void addCost(int cost){
        this.price += cost;
        logger.info("Cost is added");
    }

    public static String getStatusName(OrderStatus status){
        return status.name();
    }

    public int getStatusNumber() {
        return status.ordinal();
    }

    public OrderStatus getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getWaitresId() {
        return waiterId;
    }

    public String toString() {
        return " Order \n| id: "+ this.id + " | OrderStatus: "+ this.status + " | Waiter id: " +
                this.waiterId + " | Customer id: " + this.customerId + " | Cost: " + this.price;
    }
}
