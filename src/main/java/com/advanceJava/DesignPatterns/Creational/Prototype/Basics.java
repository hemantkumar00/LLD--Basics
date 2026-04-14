package com.advanceJava.DesignPatterns.Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Basics {
    static void main() {
        Registry<Animal> registry = new AnimalRegistry();
        Elephant e1 = (Elephant) registry.getPrototype("defaultElephant");
        Elephant e2 = (Elephant) registry.getPrototype("defaultElephant");

        e2.steps = 200; // modify only what you need

        Elephant e3 = (Elephant) registry.setPrototype("fastElephant", e2);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}

/*
 * Prototype allows us to hide the complexity of making new instances from the client.
 * The concept is to copy an existing object rather than creating a new instance from scratch, sometimes that may include costly operations.
 * The existing object acts as a prototype and contains the state of the object.
 * The newly copied object may change same properties only if required.
 * This approach saves costly resources and time, especially when object creation is a heavy process.
 *
 * - The prototype pattern is a creational design pattern that can be used to create objects that are similar to each other.
 * - Recreating an object from scratch can be costly as we might have to call an API to get the values for the fields or to perform some other costly operations.
 * The prototype pattern can be used to avoid this cost by cloning an existing object and modifying the fields that are necessary.
 * - Also, this client code does not have to deal with the complexity of creating new objects. It can simply clone the existing object and modify it as per its needs.
 * - To implement the prototype pattern, we follow these steps:
 *
 * 1) Clonable interface:- Create a common interface for all the objects that can be cloned.
 * 2) Object class:- Create a concrete class that implements the common interface and overrides the clone() method.
 * 3) Registry:- Create a registry of pre-defined prototypes with register and get methods.
 * 4) Prototype:- Create a prototype object and store in the registry.
 * 5) Clone:- Request a clone of the prototype from the registry and modify it as per its needs.
 */

abstract class Animal {
    public abstract Animal clone();
}

class Elephant extends Animal {
    int legs;
    int teeth;
    int steps;

    public Elephant(int legs, int teeth, int steps) {
        this.legs = legs;
        this.teeth = teeth;
        this.steps = steps;
    }

    @Override
    public Elephant clone() {
        return new Elephant(this.legs, this.teeth, this.steps);
    }

    @Override
    public String toString() {
        return "Elephant [legs=" + legs + ", teeth=" + teeth + ", steps=" + steps + "]";
    }
}

interface Registry <T> {
    T getPrototype( String value );
    T setPrototype( String value, T prototype);
}

class AnimalRegistry implements Registry<Animal> {
    private static final Map<String, Animal> prototypes = new HashMap<>();

    static {
        prototypes.put("defaultElephant", new Elephant(4, 2, 50));
    }

    @Override
    public Animal getPrototype(String key) {
        Animal prototype = prototypes.get(key);
        prototype = prototype == null ? prototypes.get("defaultElephant") : prototype;
        return prototype.clone();
    }

    @Override
    public Animal setPrototype(String value, Animal prototype) {
        prototypes.put(value, prototype);
        return prototype;
    }
}
