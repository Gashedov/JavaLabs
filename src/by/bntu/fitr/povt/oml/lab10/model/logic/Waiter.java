package by.bntu.fitr.povt.oml.lab10.model.logic;

import by.bntu.fitr.povt.oml.lab10.utill.IdGenerator;

public class Waiter {

    final int SINGLERATE = 10;
    final int NIGHTFACTOR = 2;

    private int id;
    private String name;
    private int earnings;
    private boolean nightRate;
    private int experience;

    public Waiter(String name, boolean nightRate, int experience ){
        this();
        this.name = name;
        this.experience = experience;
        this.nightRate = nightRate;
    }

    public Waiter(String name){
        this();
        this.name = name;
    }

    public Waiter(){
        this.id = IdGenerator.getWaiterId();
        this.earnings = 0;
    }

    public void takeOrder(Order order){
        order.setWaiter(this.id);
        order.setStatus(order.READY);
        takeHunk();
    }

    public void serveOrder(Order order){
        order.setStatus(order.SERVED);
        takeHunk();

    }

    public void closeOrder(Order order){
        order.setStatus(order.CLOSED);
        takeHunk();
    }

    private void takeHunk(){
        int hunk = SINGLERATE* (this.experience+1);
        if(nightRate){
            hunk *= NIGHTFACTOR;
        }
        this.earnings = hunk;
    }

    @Override
    public String toString() {
        return " Waiter \n| id: "+ this.id + " | Name: "+ this.name + " | Earnings: " +
                this.earnings + " | Night rate: " + this.nightRate + " | Experience: " + this.experience;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
