package by.bntu.fitr.povt.oml.lab10.model.entity;

import org.apache.log4j.Logger;

public class Customer {

    private int id;
    private String name;
    public Order order;
    private boolean smoker;
    private boolean adult;

    private static int idCounter = 1;

    {
        this.id = idCounter++;
        this.adult = true;
    }

    public Customer(String name, boolean smoker, boolean adult) {
        this.name = name;
        this.smoker = smoker;
        this.adult = adult;
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer() {
    }

    public void makeOrder(int cost) {
        order = new Order(id, cost);
        logger.info("result: " + order)
    }

    public void addOrderPosition(int cost) {
        logger.info ("result: " + order.addCost(cost));
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isAdult() {
        return adult;
    }

    public boolean isSmoker() {
        return smoker;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (order != null) {
            return " Customer \n| id: " + this.id + " | Name: " + this.name + " | Order id: " +
                    order.getId() + " | Smoker: " + this.smoker + " | Adult: " + this.adult;
        } else {
            return " Customer \n| id: " + this.id + " | Name: " + this.name + " | Order id: " +
                    null + " | Smoker: " + this.smoker + " | Adult: " + this.adult;
        }
    }
}
