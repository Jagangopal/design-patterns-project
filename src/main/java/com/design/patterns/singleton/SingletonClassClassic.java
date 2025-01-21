package com.design.patterns.singleton;

/**
 * Classic implementation of Singleton
 */
public class SingletonClassClassic {
    private static SingletonClassClassic instance;

    /**
     * private constructor to force use of
     * getInstance() to create Singleton object
     */
    private SingletonClassClassic(){}

    public static SingletonClassClassic getInstance(){
        if(instance == null)
            instance = new SingletonClassClassic();
        return instance;
    }
}
