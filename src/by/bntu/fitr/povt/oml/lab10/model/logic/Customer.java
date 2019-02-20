package by.bntu.fitr.povt.oml.lab10.model.logic;

import by.bntu.fitr.povt.oml.lab10.utill.IdGenerator;

public class Customer {

    private int id;
    private String name;
    public Order order;
    private boolean smoker;
    private boolean adult = true;

    public Customer(String name, boolean smoker, boolean adult){
        this();
        this.name = name;
        this.smoker = smoker;
        this.adult = adult;
    }
    public Customer(String name){
        this();
        this.name = name;
    }
    public Customer(){
        this.id = IdGenerator.getCustomerId();

    }
    public void makeOrder(int cost){
        order = new Order(id, cost);
    }

    public void payBill(Waiter waiter){
        waiter.closeOrder(order);
    }

    public void addOrderPosition(int cost){
        order.addCost(cost);
    }

    @Override
    public String toString() {
        try {
            return " Customer \n| id: " + this.id + " | Name: " + this.name + " | Order id: " +
                    order.getId() + " | Smoker: " + this.smoker + " | Adult: " + this.adult;
        }
        catch (NullPointerException e){
            return " Customer \n| id: " + this.id + " | Name: " + this.name + " | Order id: " +
                    null + " | Smoker: " + this.smoker + " | Adult: " + this.adult;
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
            this.name = name;
    }
}
