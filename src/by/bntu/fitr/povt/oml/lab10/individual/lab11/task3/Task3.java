package by.bntu.fitr.povt.oml.lab10.individual.task3;

import java.util.Scanner;

public class Task3 {

    private double vector[];
    private int capacity;

    Task3(double vector[]){
        this.vector = vector;
        this.capacity = vector.length;
    }

    double getMax(){
        double max = vector[0];
        for(double num: vector){
            if(max< num )
            {
                max = num;
            }
        }
        return max;
    }

    double getSum(){
        int lastPositive = 0;
        for(int i = 0; i<this.capacity; i++){
            if(vector[i] >0){
                lastPositive = i;
            }
        }

        double sum = 0;
        for(int i = 0; i<this.capacity; i++){
            if(lastPositive == i){
                break;
            }
            sum += vector[i];
        }
        return sum;
    }


}
