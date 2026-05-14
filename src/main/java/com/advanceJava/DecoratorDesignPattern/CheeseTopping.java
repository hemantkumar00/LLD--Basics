package com.advanceJava.DecoratorDesignPattern;

public class CheeseTopping implements Topping{

    private String name;
    private int price;

    private final BasePizza basePizza;
    public CheeseTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
        this.name = "CheeseTopping";
        this.price = 100;
    }

    @Override
    public int getPrice() {
        return basePizza.getPrice() + price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return basePizza.getName() +" " + name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
