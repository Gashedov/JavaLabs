package by.bntu.fitr.povt.oml.lab10.model.entity;

public interface ChiefAction {

    void addToSalaryList(Employee employee);
    void fire(Employee employee);
    void giveAPenalty(Employee employee, int sum);
    void giveSalary(int sum);
}
