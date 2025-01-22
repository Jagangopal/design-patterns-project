package com.design.patterns.creational.builder;

public class MediumCheezePizza extends VegPizza{

    public float price() {
        return 220.f;
    }

    public String name() {
        return "Cheese Pizza";
    }

    public String size() {
        return "Medium Pizza";
    }
}
