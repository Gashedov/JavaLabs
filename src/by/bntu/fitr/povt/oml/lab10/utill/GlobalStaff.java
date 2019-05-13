package by.bntu.fitr.povt.oml.lab10.utill;

import by.bntu.fitr.povt.oml.lab10.model.entity.Employee;

import java.util.Arrays;

import org.apache.log4j.Logger;

public class GlobalStaff {

    private Staff[] globalStaffList = new Staff[0];

    GlobalStaff() {

    }

    public GlobalStaff(Employee[][] list) {
        globalStaffList = new Staff[list.length];
        for (int i = 0; i < list.length; i++) {
            globalStaffList[i] = new Staff(list[i]);
        }
    }

    public GlobalStaff(int numberOfRows, int numberOfColumns){
        globalStaffList = new Staff[numberOfColumns];
        for (int i = 0; i < numberOfColumns; i++){
            globalStaffList[i] = new Staff(numberOfRows);
        }
    }

    public GlobalStaff(GlobalStaff other) { // TODO: - copy initializer
        this(other.getStaffList());
    }

    public Employee[][] getStaffList() {
        Employee[][] staffList = new Employee[globalStaffList.length][];
        for (int i = 0; i < globalStaffList.length; i++) {
            staffList[i] = globalStaffList[i].getStaffList();
            logger.info ("result: Staff list is getted");
        }
        return staffList;
    }

    public int getLength() {
        return globalStaffList.length;
    }

    public int getLength(int indexOfColumn) {
        return globalStaffList[indexOfColumn].getLength();
    }

    public void append(Employee waiter, int indexOfColumn) {
        if (indexOfColumn >= 0 && indexOfColumn < globalStaffList.length) {
            globalStaffList[indexOfColumn].append(waiter);
            logger.info ("result: Appended");
        } else {
            System.out.println("index out of range");
            logger.warn("index out of range");
        }
    }

    public void add(Employee waiter, int position, int indexOfColumn) {
        if (indexOfColumn >= 0 && indexOfColumn < globalStaffList.length) {
            globalStaffList[indexOfColumn].add(waiter, position);
            logger.info ("result: Added");
        } else {
            System.out.println("index out of range");
            logger.warn("index out of range");
        }
    }

    public void appendColumn(){
        int size = globalStaffList.length;
        Staff[] buffer = globalStaffList;
        globalStaffList = new Staff[size+1];
        System.arraycopy(buffer,0, globalStaffList,0, size);
        globalStaffList[size] = new Staff();
        logger.info ("result: Colomn is appended");
    }

    public void removeColumn(int indexOfColumn){

        int size = globalStaffList.length;

        if(indexOfColumn >= 0 && indexOfColumn <= size-1) {
            Staff[] buffer = globalStaffList;
            globalStaffList = new Staff[size - 1];
            System.arraycopy(buffer, 0, globalStaffList, 0, indexOfColumn);
            System.arraycopy(buffer, indexOfColumn+1, globalStaffList, indexOfColumn,
                    size - indexOfColumn - 1);
            logger.info ("result: Colomn is removed");
        }else{
            System.out.println("Position out of range");
            logger.warn ("Position out of range");
        }
    }

    public void remove(int position, int indexOfColumn) {
        if (indexOfColumn >= 0 && indexOfColumn < globalStaffList.length) {
            globalStaffList[indexOfColumn].remove(position);
            logger.info ("result: Is removed");
        } else {
            System.out.println("index out of range");
            logger.warn ("Index out of range");
        }
    }

    public Employee findById(int id) {
        Employee finding = null;
        for (Staff list : globalStaffList) {
            finding = list.findById(id);
            if (finding != null){
                logger.info ("result: finding unsucceeded");
                break;
            }
        }
        if (finding != null) {
            System.out.println("finding succeeded");
            logger.info ("result: finding succeeded");
        }
        return finding;
    }

    public Employee getByPosition(int position, int indexOfColumn) {
        Employee worker = null;
        if (indexOfColumn >= 0 && indexOfColumn < globalStaffList.length) {
            worker = globalStaffList[indexOfColumn].getByPosition(position);

        } else {
            System.out.println("index out of range");
            logger.warn ("index out of range");
        }
        return worker;
    }

    public Employee getWaiterWithMaxEarning() {
        Employee finding = globalStaffList[0].getWaiterWithMaxEarning();
        for (int i = 1; i < globalStaffList.length; i++) {
            Employee waiter = globalStaffList[i].getWaiterWithMaxEarning();
            if (finding.getEarnings() < waiter.getEarnings()) {
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
