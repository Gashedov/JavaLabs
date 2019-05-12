package by.bntu.fitr.povt.oml.lab10.model.entity;

import by.bntu.fitr.povt.oml.lab10.utill.Staff;

public class Manager extends Employee implements ManagerAction {

    private String name;
    private int earnings;
    private boolean nightRate;
    private int experience;
    private int id;
    private Staff subordinateEmployees;

    private static int idCounter = 1;

    {
        this.id = idCounter++;
        this.earnings = 0;
        this.subordinateEmployees = new Staff();
    }

    public Manager(String name, boolean nightRate, int experience) {
        this.name = name;
        this.nightRate = nightRate;
        this.experience = experience;
    }

    public void getSalary(int sum) {

    }

    public void getFine(int sum) {

    }

    public void quit() {

    }

    public void addWaiter(Waiter newWaiter){
        subordinateEmployees.append(newWaiter);
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

    public boolean isNightRate() {
        return nightRate;
    }

    public void setNightRate(boolean nightRate) {
        this.nightRate = nightRate;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

}
