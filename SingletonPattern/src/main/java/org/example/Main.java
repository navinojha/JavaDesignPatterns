package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DatabaseLogger d1 = DatabaseLogger.getInstance();
        DatabaseLogger d2 = DatabaseLogger.getInstance();

//        System.out.println(d1.hashCode());
//        System.out.println(d2.hashCode());
//
//        DatabaseLoggerEagerSingleton dE1 = DatabaseLoggerEagerSingleton.getInstance();
//        DatabaseLoggerEagerSingleton dE2 = DatabaseLoggerEagerSingleton.getInstance();
//
//        System.out.println(dE1 == dE2);
//        System.out.println(dE1.hashCode());
//        System.out.println(dE2.hashCode());

        BillPughSingleton bp1 = BillPughSingleton.getInstance();
        BillPughSingleton bp2 = BillPughSingleton.getInstance();

        System.out.println(bp1.hashCode());
        System.out.println(bp2.hashCode());

    }
}