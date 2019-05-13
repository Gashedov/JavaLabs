package by.bntu.fitr.povt.oml.lab10.model.entity;

import by.bntu.fitr.povt.oml.lab10.utill.Staff;
import org.apache.log4j.Logger;

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
        logger.info("result: " + subordinateEmployees.append(newEmployee));
    }

    public void fire(Employee employee) {
        logger.info("result: " + subordinateEmployees.remove(employee));
    }

    public void giveAPenalty(Employee employee, int sum) {
        logger.info ("result: " + subordinateEmployees.findById(employee.getId()).getFine(sum));
    }

    public void giveSalary(int sum) {
        for (Employee employee : logger.info("result: " + subordinateEmployees.getStaffList())){
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
