package by.bntu.fitr.OML.javalabs.lab11.util;
import java.util.Random;

public class Randomizer {
    public static double[] array() {
        Random random = new Random();
        double[] array = new double[10];
        for (int n = 0; n < 10; n++) {
            array[n] = random.nextFloat() * 200 - 100;
        }

        return array;
    }
}
