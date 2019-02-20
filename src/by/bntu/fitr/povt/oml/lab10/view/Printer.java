package by.bntu.fitr.povt.oml.lab10.view;

import by.bntu.fitr.povt.oml.lab10.model.logic.Customer;
import by.bntu.fitr.povt.oml.lab10.model.logic.Order;
import by.bntu.fitr.povt.oml.lab10.model.logic.Waiter;

public class Printer {

    public static void print(String s){
        System.out.println(s);
    }
    public static void showOrder(Order order){
        System.out.println(order);
    }
    public static void showCustomer(Customer customer){
        System.out.println(customer);
    }

    public static void showWaiter(Waiter waiter){
        System.out.println(waiter);
    }
}
