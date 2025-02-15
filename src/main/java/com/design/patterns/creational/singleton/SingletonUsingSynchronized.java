package com.design.patterns.creational.singleton;

/**
 * Thread Synchronized Java implementation of
 * singleton design pattern
 */
public class SingletonUsingSynchronized {
    private static SingletonUsingSynchronized instance;

    private SingletonUsingSynchronized(){}

    // Only one thread can execute this at a time
    public static synchronized SingletonUsingSynchronized getInstance(){
        if(instance == null)
            instance = new SingletonUsingSynchronized();
        return instance;
    }
}
