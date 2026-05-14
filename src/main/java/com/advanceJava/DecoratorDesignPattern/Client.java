package com.advanceJava.DecoratorDesignPattern;


public class Client {
    public static void main(String[] args) {
        BasePizza pizza = new Margareta();
        pizza = new ExtraCheeseTopping(pizza);
        pizza = new CheeseTopping(pizza);
        System.out.println(pizza.getPrice());
        System.out.println(pizza.getName());
    }
}
