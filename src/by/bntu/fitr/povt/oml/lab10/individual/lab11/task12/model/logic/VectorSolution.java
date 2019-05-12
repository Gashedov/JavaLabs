package by.bntu.fitr.OML.javalabs.lab11.model.logic;

import java.lang.String;

public class VectorSolution {

    public static int minValue (double[] array){
        double min = array[0];
        int index = 0;
        for (int n = 1; n < array.length; n++){
            if (array[n] < min){
                min = array[n];
                index = n;
            }
        }
        return index;
    }
    public static String calculation(double[] array){
        double resultOfAddition = 0;
        double resultOfMultiplication = 1;

        for (int n = 0; n < VectorSolution.minValue(array); n++){
            resultOfAddition += array[n];
            if (array[n]>0){
                resultOfMultiplication *= array[n];
            }
        }
        String info = "Additing "+resultOfAddition + " Multiplicating" + resultOfMultiplication;
        return info;
    }

}
