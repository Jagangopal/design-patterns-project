package com.design.patterns.creational.builder;
import java.io.IOException;
public class BuilderDemo {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        OrderBuilder builder=new OrderBuilder();

        OrderedItems orderedItems=builder.preparePizza();

        orderedItems.showItems();

        System.out.println("\n");
        System.out.println("Total Cost : "+ orderedItems.getCost());

    }
}
