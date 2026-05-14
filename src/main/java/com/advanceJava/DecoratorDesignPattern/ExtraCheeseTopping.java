package com.advanceJava.DecoratorDesignPattern;

public class ExtraCheeseTopping implements Topping{

    private String name;
    private int price;
    private final BasePizza basePizza;

    public ExtraCheeseTopping(BasePizza basePizza){
        this.basePizza = basePizza;
        this.name = "ExtraCheeseTopping";
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
        return basePizza.getName()+" "+this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
