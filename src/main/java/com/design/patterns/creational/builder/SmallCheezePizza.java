package com.design.patterns.creational.builder;

public class SmallCheezePizza extends VegPizza{

    public float price() {
        return 170;
    }

    public String name() {
        return "Cheese Pizza";
    }

    public String size() {
        return "Small Size";
    }

    public static class ExtraLargeCheezePizza extends VegPizza {
        public float price() {
            return 300;
        }

        public String name() {
            return "Cheese Pizza";
        }

        public String size() {
            return "Extra Larger Size";
        }
    }
}
