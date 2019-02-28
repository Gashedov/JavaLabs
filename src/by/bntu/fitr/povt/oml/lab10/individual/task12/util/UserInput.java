package by.bntu.fitr.OML.javalabs.lab11.util;

import java.util.Scanner;

public class UserInput {

    private static Scanner scanner  = new Scanner(System.in);

    public static double inputDouble(String msg) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(msg);
            if(scanner.hasNextDouble()){
                return scanner.nextDouble();
            }
            else{
                System.out.println("You entered a wrong symbol. The type must be double. Please try again :) ");
                scanner.nextLine();
            }
        }
    }
    public static int inputInt(String msg) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(msg);
            if(scanner.hasNextInt()){
                return scanner.nextInt();
            }
            else{
                System.out.println("You entered a wrong symbol. The type must be integer. Please try again :) ");
                scanner.nextLine();
            }
        }
    }

    public static String inputString(String msg) {
        System.out.println(msg);
        return scanner.nextLine();
    }

    public static char inputChar(String msg){
        System.out.println(msg);
        return scanner.next().charAt(0);
    }

}
