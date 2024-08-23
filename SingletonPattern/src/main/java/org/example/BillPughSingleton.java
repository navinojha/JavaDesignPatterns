package org.example;

public class BillPughSingleton {

    private BillPughSingleton() {}

    private class BillPughSingletonHelper {
        private static BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return BillPughSingletonHelper.INSTANCE;
    }
}