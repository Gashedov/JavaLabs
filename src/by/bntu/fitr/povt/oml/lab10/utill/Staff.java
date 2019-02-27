package by.bntu.fitr.povt.oml.lab10.utill;

import by.bntu.fitr.povt.oml.lab10.model.entity.Waiter;

import java.util.Arrays;

public class Staff {

    private Waiter[] staffList = new Waiter[0];


    Staff(){

    }

    Staff(Waiter[] staffList){
        this.staffList = staffList;
    }

    Staff(Staff other){
        this(other.getStaffList());
    }

    public Waiter[] getStaffList() {
        return staffList;
    }

    public int length(){
        return staffList.length;
    }

    public void append(Waiter waiter){
        int size = staffList.length;
        Waiter[] buffer = staffList;
        staffList = new Waiter[size+1];
        System.arraycopy(buffer,0, staffList,0, size);
        staffList[size] = waiter;
    }

    public void add(Waiter waiter, int position) {
        int size = staffList.length;
        if(size == 0){
            staffList = new Waiter[1];
            staffList[0] = waiter;
        }else {
            if (position >= 0 && position <= size) {

                Waiter[] buffer = staffList;
                staffList = new Waiter[size + 1];

                System.arraycopy(buffer, 0, staffList, 0, position);
                staffList[position] = waiter;
                System.arraycopy(buffer, position, staffList, position + 1, size - position - 1);
            } else {
                System.out.println("Position out of range");
            }
        }
    }

    public void remove (Waiter waiter){
        int size = staffList.length;
        boolean success = false;

        if(size != 0) {
            for (int i = 0; i < size; i++) {
                if (waiter.equals(staffList[i])) {
                    Waiter[] buffer = staffList;
                    staffList = new Waiter[size - 1];
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
            Waiter[] buffer = staffList;
            staffList = new Waiter[size - 1];
            System.arraycopy(buffer, 0, staffList, 0, position);
            System.arraycopy(buffer, position+1, staffList, position, size - position - 1);
            }else{
            System.out.println("Position out of range");
        }

        }

    public Waiter findById(int id){
        Waiter finding = null;

        for (Waiter worker:staffList) {
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

    public Waiter findByName(String name){
        Waiter finding = null;

        for (Waiter worker:staffList) {
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

    public Waiter getByPosition(int position){
        Waiter worker = null;
        if (position >= 0 && position <= staffList.length-1) {
            worker =  staffList[position];
        }else {
            System.out.println("Position out of range");
        }
        return worker;
    }

    public Waiter getWaiterWithMaxEarning(){
        int maxEarning = 0 ;
        Waiter finding = null;

        for(Waiter worker:staffList){
            int earnings = worker.getEarnings();

            if(earnings > maxEarning){
                maxEarning = earnings;
            }
        }

        for(Waiter worker:staffList){
            if(maxEarning == worker.getEarnings())
                finding = worker;
        }

        if (finding == null){
            System.out.println("Object is not found");
        }

        return finding;
    }

    public Waiter getWaiterWithMaxExperience(){

        int maxExperience = 0 ;
        Waiter finding = null;

        for(Waiter worker:staffList){
            int experience = worker.getExperience();

            if(experience > maxExperience){
                maxExperience = experience;
            }
        }

        for(Waiter worker:staffList){
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
