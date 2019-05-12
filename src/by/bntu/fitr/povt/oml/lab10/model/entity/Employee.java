package by.bntu.fitr.povt.oml.lab10.model.entity;

public abstract class Employee implements EmployeeAction {
     String name;
    private int earnings;
    private boolean nightRate;
    private int experience;
    private int id;

    public abstract String getName();
    public abstract int getEarnings();
    public abstract boolean isNightRate();
    public abstract int getExperience();
    public abstract int getId();

    public abstract void setName(String name);
    public abstract void setNightRate(boolean nightRate);
    public abstract void setExperience(int experience);

}
