package by.bntu.fitr.povt.oml.lab10.utill;

import by.bntu.fitr.povt.oml.lab10.model.entity.Waiter;

import java.util.Arrays;

public class GlobalStaff {

    private Staff[] globalStaffList = new Staff[0];

    GlobalStaff(){

    }

    public GlobalStaff(Waiter[][] list){
        globalStaffList = new Staff[list.length];
        for(int i = 0; i < list.length; i++){
            globalStaffList[i] = new Staff(list[i]);
        }
    }

    public GlobalStaff(GlobalStaff other){
        this(other.getStaffList());
    }

    public Waiter[][] getStaffList() {          //Testing needed
        Waiter[][] staffList = new Waiter[globalStaffList.length][];
        for(int i = 0; i<globalStaffList.length; i++){
            staffList[i] = globalStaffList[i].getStaffList();
        }
        return staffList;
    }

    public int getLength(){
        return globalStaffList.length;
    }

    public int getLength(int i){
        return globalStaffList[i].getLength();
    }

    public void append(Waiter waiter, int i){
        if(i>=0 && i <globalStaffList.length) {
            globalStaffList[i].append(waiter);
        }
        else{
            System.out.println("index out of range");
        }
    }

    public void add(Waiter waiter, int position, int i) {
        if (i >= 0 && i < globalStaffList.length) {
            globalStaffList[i].add(waiter, position);
        } else {
            System.out.println("index out of range");
        }
    }

    public void remove(Waiter waiter, int i){
        if (i >= 0 && i < globalStaffList.length) {
            globalStaffList[i].remove(waiter);
        } else {
            System.out.println("index out of range");
        }
    }

    public void remove(int position, int i){
        if (i >= 0 && i < globalStaffList.length) {
            globalStaffList[i].remove(position);
        } else {
            System.out.println("index out of range");
        }
    }

    public Waiter findById(int id){
        Waiter finding = null;
        for(Staff list:globalStaffList){
            finding = list.findById(id);
            if(finding!=null)break;
        }
        if(finding != null){
            System.out.println("finding succeeded");
        }
        return finding;
    }

    public Waiter getByPosition(int position, int i){
        Waiter worker = null;
        if (i >= 0 && i < globalStaffList.length) {
            worker =  globalStaffList[i].getByPosition(position);
        } else {
            System.out.println("index out of range");
        }
        return worker;
    }

    public Waiter getWaiterWithMaxEarning(){
        Waiter finding = globalStaffList[0].getWaiterWithMaxEarning();
        for(int i = 1; i<globalStaffList.length; i++){
            Waiter waiter = globalStaffList[i].getWaiterWithMaxEarning();
            if(finding.getEarnings() < waiter.getEarnings()){
                finding = waiter;
            }
        }
        return finding;
    }

    @Override
    public String toString() {
        return Arrays.toString(globalStaffList);
    }
}
