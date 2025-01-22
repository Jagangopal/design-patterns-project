package com.design.patterns.creational.singleton;

public class SingletonWithEagerInstantiation {
    private static SingletonWithEagerInstantiation instance =  new SingletonWithEagerInstantiation();
    private SingletonWithEagerInstantiation(){}

    public static SingletonWithEagerInstantiation getInstance(){
        return instance;
    }
}
