package com.advanceJava.DecoratorDesignPattern;

public class Margareta implements BasePizza {
    private int price;
    private String name;

    public Margareta() {
        this.price = 100;
        this.name = "Margareta";
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
