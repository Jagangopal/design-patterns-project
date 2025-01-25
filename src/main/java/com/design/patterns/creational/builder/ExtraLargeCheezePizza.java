package com.design.patterns.creational.builder;

public class ExtraLargeCheezePizza extends VegPizza{
    public float price() {
        return 300.f;
    }

    public String name() {
        return "Cheese Pizza";
    }

    public String size() {
        return "Extra-Large Cheese";
    }
}
