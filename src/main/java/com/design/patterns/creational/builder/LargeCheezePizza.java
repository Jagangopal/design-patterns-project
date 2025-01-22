package com.design.patterns.creational.builder;

public class LargeCheezePizza extends VegPizza{
    public float price() {
        return 260;
    }

    public String name() {
        return "Cheese Pizza";
    }

    public String size() {
        return "Larger Size";
    }
}
