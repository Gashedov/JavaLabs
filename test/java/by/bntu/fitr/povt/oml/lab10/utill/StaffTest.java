package by.bntu.fitr.povt.oml.lab10.utill;

import by.bntu.fitr.povt.oml.lab10.model.entity.Waiter;
import org.junit.Test;

import static org.junit.Assert.*;

public class StaffTest {

    Waiter w1 = new Waiter("Oleg" ,false,10);
    Waiter w2 = new Waiter("Artem",false,11);
    Waiter w3 = new Waiter("Jenya",false,17);
    Waiter[] list = new Waiter[]{w1,w2,w3};
    private Staff staff = new Staff(list);


    @Test
    public void append() {
        Waiter waiter1 = new Waiter();
        staff.append(waiter1);
        assertEquals(waiter1,staff.getByPosition(staff.length()-1));
    }

    @Test
    public void add() {
        Waiter waiter2 = new Waiter();
        int position = 1;
        staff.add(waiter2,position);
        assertEquals(waiter2,staff.getByPosition(position));
    }

    @Test
    public void remove() {

    }

    @Test
    public void remove1() {
    }

    @Test
    public void findById() {
        assertEquals(w2,staff.findById(w2.getId()));
    }

    @Test
    public void findByName() {
        assertEquals(w3,staff.findByName(w3.getName()));
    }

    @Test
    public void getByPosition() {
        assertEquals(w1,staff.getByPosition(0));
    }

    @Test
    public void getWaiterWithMaxEarning() {
        w1.setEarnings(10);
        w2.setEarnings(40);
        w1.setEarnings(30);
        assertEquals(w2, staff.getWaiterWithMaxEarning());

    }

    @Test
    public void getWaiterWithMaxExperience() {
        assertEquals(w3, staff.getWaiterWithMaxExperience());
    }
}