package com.advanceJava.DecoratorDesignPattern;

public class OTCPizza implements BasePizza{
    private String name;
    private int price;
    public OTCPizza() {
        this.name = "OTCPizza";
        this.price = 200;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
