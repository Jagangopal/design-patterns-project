package com.design.patterns.creational.singleton;

/**
 * Double Checked Locking based Java implementation of
 * singleton design pattern
 */
public class SingletonUsingDoubleCheckedLocking {
    private static volatile SingletonUsingDoubleCheckedLocking instance;

    private SingletonUsingDoubleCheckedLocking(){}

    public static SingletonUsingDoubleCheckedLocking getInstance(){
        if (instance == null) {
            // To make thread safe
            synchronized(SingletonUsingDoubleCheckedLocking.class){
                // check again as multiple threads
                // can reach above step
                if(instance == null){
                    instance = new SingletonUsingDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
