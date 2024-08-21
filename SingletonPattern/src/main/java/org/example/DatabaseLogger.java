package org.example;

public class DatabaseLogger {

    private static DatabaseLogger INSTANCE;

    private DatabaseLogger() {}

    public static DatabaseLogger getInstance(){
        if(INSTANCE == null){
            INSTANCE = new DatabaseLogger();
        }
        return INSTANCE;
    }
}
