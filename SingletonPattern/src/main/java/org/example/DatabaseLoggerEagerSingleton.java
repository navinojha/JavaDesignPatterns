package org.example;

public class DatabaseLoggerEagerSingleton {
    private static DatabaseLoggerEagerSingleton INSTANCE = new DatabaseLoggerEagerSingleton();

    private DatabaseLoggerEagerSingleton() {}

    public static DatabaseLoggerEagerSingleton getInstance() {
        return INSTANCE;
    }
}
