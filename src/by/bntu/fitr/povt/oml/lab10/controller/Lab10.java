package by.bntu.fitr.povt.oml.lab10.controller;

import by.bntu.fitr.povt.oml.lab10.model.entity.Customer;
import by.bntu.fitr.povt.oml.lab10.model.entity.Waiter;
import by.bntu.fitr.povt.oml.lab10.view.Printer;

public class Lab10 {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Waiter waiter1 = new Waiter("Olya");

        customer1.makeOrder(100);
        customer2.makeOrder(200);

        Printer.print(customer1);

        waiter1.takeOrder(customer1.order);
        waiter1.takeOrder(customer2.order);

        customer1.addOrderPosition(50);

        Printer.print(customer1.order);
        Printer.print(customer2);

        waiter1.serveOrder(customer1.order);
        Printer.print(customer1.order);
    }
}
