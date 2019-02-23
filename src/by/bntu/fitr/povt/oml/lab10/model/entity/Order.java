package by.bntu.fitr.povt.oml.lab10.model.entity;

public class Order {

    enum Status {
        OPENED,
        READY,
        SERVED,
        CLOSED
    }

    private int id;
    private Status status;
    private int waiterId;
    private int customerId;
    private int price;

    private static int idCounter = 1;

    {
        this.id = idCounter++ ;
        this.status = Status.OPENED;
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
            this.status = Status.valueOf(st);
        }
        catch (IllegalArgumentException illegalArgumentException){
            System.out.println("Incorrect status argument");
        }
        catch (NullPointerException nullPointException){
            System.out.println("No status argument");
        }
    }
    public void addCost(int cost){
        this.price += cost;
    }

    public static String getStatusName(Status status){
        return status.name();
    }

    public int getStatusNumber() {
        return status.ordinal();
    }

    public Status getStatus() {
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

    @Override
    public String toString() {
        return " Order \n| id: "+ this.id + " | Status: "+ this.status + " | Waiter id: " +
                this.waiterId + " | Customer id: " + this.customerId + " | Cost: " + this.price;
    }
}
