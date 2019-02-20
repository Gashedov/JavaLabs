package by.bntu.fitr.povt.oml.lab10.model.logic;

import by.bntu.fitr.povt.oml.lab10.utill.IdGenerator;

public class Order {

    final int OPENED  = 0;
    final int READY  = 1;
    final int SERVED = 2;
    final int CLOSED  = 3;

    private int id;
    private int status;
    private int waiterId;
    private int customerId;
    private int price;

    Order(int customerId, int price){
        this.customerId = customerId;
        this.id = IdGenerator.getOrderId();
        this.status = OPENED;
        this.price = price;

    }

    public void setWaiter(int id){
        this.waiterId = id;
    }

    public void setStatus(int status) {
        if (status >= READY && status <= CLOSED) {
            this.status = status;
        }
        else{
            System.out.println("Incorrect status");
        }
    }
    public void addCost(int cost){
        this.price += cost;
    }

    public static String showStatus(int st){
        String status = "";
        switch(st){

            case 0:
                status = "Opened";
                break;
            case 1:
                status = "Ready";
                break;
            case 2:
                status = "Served";
                break;
            case 3:
                status = "Closed";
                break;
        }
        return status;
    }

    @Override
    public String toString() {
        return " Order \n| id: "+ this.id + " | Status: "+ this.status + " | Waiter id: " +
                this.waiterId + " | Customer id: " + this.customerId + " | Cost: " + this.price;
    }

    public int getStatus() {
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

}
