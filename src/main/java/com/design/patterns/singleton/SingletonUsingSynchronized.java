package com.design.patterns.singleton;

/**
 * Thread Synchronized Java implementation of
 * singleton design pattern
 */
public class SingletonUsingSynchronized {
    private static SingletonUsingSynchronized instance;

    private SingletonUsingSynchronized(){}

    // Only one thread can execute this at a time
    public static SingletonUsingSynchronized getInstance(){
        if(instance == null)
            instance = new SingletonUsingSynchronized();
        return instance;
    }
}
