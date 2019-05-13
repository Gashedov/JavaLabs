package by.bntu.fitr.povt.oml.lab10.model.entity;

import java.util.LinkedList;
import org.apache.log4j.Logger;


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
        logger.info("Salary is good");
    }

    public void getFine(int sum){
        this.earnings -= sum;
        logger.info ("Fine is good :b");
    }

    public void takeOrder(Order order){
        order.setWaiter(this.id);
        orderList.add(order);
        order.setStatus("READY");
        takeHunk();
        logger.info("result: Order is taken");
    }

    public void serveOrder(Order order){
        order.setStatus("SERVED");
        takeHunk();
        logger.info ("result: Order is served");

    }

    public void closeOrder(Order order){
        order.setStatus("CLOSED");
        takeHunk();
        logger.info ("result: Order is closed");
    }

    private void takeHunk(){
        int hunk = SINGLERATE* (this.experience+1);
        if(nightRate){
            hunk *= NIGHTFACTOR;
            logger.warn("NIGTFACTOR");
        }
        this.earnings += hunk;
        logger.info ("result: Hunk is taken");
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
