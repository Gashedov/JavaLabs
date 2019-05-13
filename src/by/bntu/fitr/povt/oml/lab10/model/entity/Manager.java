package by.bntu.fitr.povt.oml.lab10.model.entity;

import by.bntu.fitr.povt.oml.lab10.utill.Staff;

public class Manager implements ChiefAction {

    private int id;
    private String name;
    private Staff subordinateEmployees;

    private static int idCounter = 1;

    {
        this.id = idCounter++;
        this.subordinateEmployees = new Staff();
    }

    public Manager() {
    }

    public Manager(Staff subordinateEmployees){
        this.subordinateEmployees = subordinateEmployees;
    }

    public void addToSalaryList(Employee newEmployee){
        subordinateEmployees.append(newEmployee);
    }

    public void fire(Employee employee) {
        subordinateEmployees.remove(employee);
    }

    public void giveAPenalty(Employee employee, int sum) {
        subordinateEmployees.findById(employee.getId()).getFine(sum);
    }

    public void giveSalary(int sum) {
        for (Employee employee : subordinateEmployees.getStaffList()){
            employee.getSalary(sum);
        }
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

    public Staff getSubordinateEmployees() {
        return subordinateEmployees;
    }
}
