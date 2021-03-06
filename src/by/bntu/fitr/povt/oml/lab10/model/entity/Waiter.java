package by.bntu.fitr.povt.oml.lab10.model.entity;

import java.util.LinkedList;

public class Waiter extends Employee {

    private final int SINGLERATE = 10;
    private final int NIGHTFACTOR = 2;

    private int id;
    private String name;
    private int earnings;
    private boolean nightRate;
    private int experience;
    private LinkedList<Order> orderList;

    private static int idCounter = 1;

    {
        this.id = idCounter++;
        this.earnings = 0;
        this.orderList = new LinkedList<>();
    }

    public Waiter(String name, boolean nightRate, int experience ){
        this.name = name;
        this.experience = experience;
        this.nightRate = nightRate;
    }

    public Waiter(String name){
        this.name = name;
    }

    public Waiter(){
    }

    public void getSalary(int sum){
        this.earnings += sum;
        this.earnings += 1;
    }

    public void getFine(int sum){
        this.earnings -= sum;
    }

    public void takeOrder(Order order){
        order.setWaiter(this.id);
        orderList.add(order);
        order.setStatus("READY");
        takeHunk();
    }

    public void serveOrder(Order order){
        order.setStatus("SERVED");
        takeHunk();

    }

    public void closeOrder(Order order){
        order.setStatus("CLOSED");
        takeHunk();
    }

    private void takeHunk(){
        int hunk = SINGLERATE* (this.experience+1);
        if(nightRate){
            hunk *= NIGHTFACTOR;
        }
        this.earnings += hunk;
    }

    public boolean isNightRate() {
        return nightRate;
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

    public int getEarnings() {
        return earnings;
    }

    public int getExperience() {
        return experience;
    }

    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setNightRate(boolean nightRate) {
        this.nightRate = nightRate;
    }

    @Override
    public String toString() {
        return " Waiter \n| id: "+ this.id + " | Name: "+ this.name + " | Earnings: " +
                this.earnings + " | Night rate: " + this.nightRate + " | Experience: " + this.experience;
    }

}
