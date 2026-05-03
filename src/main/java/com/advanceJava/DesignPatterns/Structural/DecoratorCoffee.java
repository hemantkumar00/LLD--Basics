package com.advanceJava.DesignPatterns.Structural;

public class DecoratorCoffee {
    static void main() {
        Coffee coffee = new BasicCoffee();
        coffee = new MilkCoffee(coffee);
        coffee = new SugaryCoffee(coffee);
        coffee = new WhipCoffee(coffee);

        System.out.println(coffee.getDescription());
        System.out.println("Total:- "+coffee.getPrice());
    }
}

interface Coffee {
    String getDescription();
    double getPrice();
}

class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Plain Coffee:- 50.00$";
    }
    @Override
    public double getPrice() {
        return 50.0;
    }
}

abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

class MilkCoffee extends CoffeeDecorator {
    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescription()+ "\nMilk:- 10.00$";
    }
    @Override
    public double getPrice() {
        return coffee.getPrice() + 10.0;
    }
}

class SugaryCoffee extends CoffeeDecorator {
    public SugaryCoffee(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + "\nSugar:- 10.00$";
    }
    @Override
    public double getPrice() {
        return coffee.getPrice() + 10.0;
    }
}

class WhipCoffee extends CoffeeDecorator {
    public WhipCoffee(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + "\nWhip:- 5.00$";
    }
    @Override
    public double getPrice() {
        return coffee.getPrice() + 5.0;
    }
}