package com.design.patterns.singleton;

public class SingletonWithEagerInstantiation {
    private static SingletonWithEagerInstantiation instance =  new SingletonWithEagerInstantiation();
    private SingletonWithEagerInstantiation(){}

    public static SingletonWithEagerInstantiation getInstance(){
        return instance;
    }
}
