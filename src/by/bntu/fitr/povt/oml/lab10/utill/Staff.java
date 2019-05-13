package by.bntu.fitr.povt.oml.lab10.utill;

import by.bntu.fitr.povt.oml.lab10.model.entity.Employee;

import java.util.Arrays;

public class Staff {

    private Employee[] staffList = new Employee[0];


    public Staff(){

    }

    public Staff(Employee[] staffList){
        this.staffList = staffList;
    }

    public Staff(int numberOfElements){
        staffList = new Employee[numberOfElements];
    }

    Staff(Staff other){  // TODO: - copy initializer
        this(other.getStaffList());
    }

    public Employee[] getStaffList() {
        return staffList;
    }

    public int getLength(){
        return staffList.length;
    }

    public void append(Employee employee){
        int size = staffList.length;
        Employee[] buffer = staffList;
        staffList = new Employee[size+1];
        System.arraycopy(buffer,0, staffList,0, size);
        staffList[size] = employee;
    }

    public void add(Employee employee, int position) {
        int size = staffList.length;
        if(size == 0){
            staffList = new Employee[1];
            staffList[0] = employee;
        }else {
            if (position >= 0 && position <= size) {

                Employee[] buffer = staffList;
                staffList = new Employee[size + 1];

                System.arraycopy(buffer, 0, staffList, 0, position);
                staffList[position] = employee;
                System.arraycopy(buffer, position, staffList, position + 1, size - position - 1);
            } else {
                System.out.println("Position out of range");
            }
        }
    }

    public void remove (Employee employee){
        int size = staffList.length;
        boolean success = false;

        if(size != 0) {
            for (int i = 0; i < size; i++) {
                if (employee.equals(staffList[i])) {
                    Employee[] buffer = staffList;
                    staffList = new Employee[size - 1];
                    System.arraycopy(buffer, 0, staffList, 0, i);
                    System.arraycopy(buffer, i+1, staffList, i, size - i - 1);
                    success = true;
                    break;
                }
            }
            if (!success) {
                System.out.println("Object is not found");
            }
        }else{
            System.out.println("List is empty");
        }

    }

    public void remove (int position){
        int size = staffList.length;

        if(position >= 0 && position <= size-1) {
            Employee[] buffer = staffList;
            staffList = new Employee[size - 1];
            System.arraycopy(buffer, 0, staffList, 0, position);
            System.arraycopy(buffer, position+1, staffList, position, size - position - 1);
            }else{
            System.out.println("Position out of range");
        }

        }

    public Employee findById(int id){
        Employee finding = null;

        for (Employee worker:staffList) {
            if(worker.getId() == id){
                finding = worker;
                break;
            }
        }
        if(finding == null){
            System.out.println("Object is not found");
        }
        return finding;
    }

    public Employee findByName(String name){
        Employee finding = null;

        for (Employee worker:staffList) {
            if(name.equals(worker.getName())){
                finding = worker;
                break;
            }
        }
        if(finding == null){
            System.out.println("Object is not found");
        }
        return finding;
    }

    public Employee getByPosition(int position){
        Employee worker = null;
        if (position >= 0 && position <= staffList.length-1) {
            worker =  staffList[position];
        }else {
            System.out.println("Position out of range");
        }
        return worker;
    }

    public Employee getWaiterWithMaxEarning(){
        int maxEarning = 0 ;
        Employee finding = null;

        for(Employee worker:staffList){
            int earnings = worker.getEarnings();

            if(earnings > maxEarning){
                maxEarning = earnings;
            }
        }

        for(Employee worker:staffList){
            if(maxEarning == worker.getEarnings())
                finding = worker;
        }

        if (finding == null){
            System.out.println("Object is not found");
        }

        return finding;
    }

    public Employee getWaiterWithMaxExperience(){

        int maxExperience = 0 ;
        Employee finding = null;

        for(Employee worker:staffList){
            int experience = worker.getExperience();

            if(experience > maxExperience){
                maxExperience = experience;
            }
        }

        for(Employee worker:staffList){
            if(maxExperience == worker.getExperience())
                finding = worker;
        }

        if (finding == null){
            System.out.println("Object is not found");
        }

        return finding;
    }

    @Override
    public String toString() {
        return Arrays.toString(staffList);
    }
}
