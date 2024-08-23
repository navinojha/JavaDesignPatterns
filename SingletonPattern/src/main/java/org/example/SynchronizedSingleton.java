package org.example;

public class SynchronizedSingleton {
    private static SynchronizedSingleton INSTANCE;

    private SynchronizedSingleton() {}

    public synchronized static SynchronizedSingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SynchronizedSingleton();
        }
        return INSTANCE;
    }
}
