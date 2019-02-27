package by.bntu.fitr.povt.oml.lab10.individual.task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {
    private double[] vector = new double[]{0.0,-1.3,-0.3,10.0,5.0};
    private Task3 task3 = new Task3(vector);


    @Test
    public void getMax() {
        assertEquals(vector[3],task3.getMax(),0.0001);
    }

    @Test
    public void getSum() {
        assertEquals(10.0-0.3-1.3, task3.getSum(), 0.0001);
    }
}