package com.advanceJava.DesignPatterns.Behavioural;


/*
 * 4) Client - creates and configures the context and the strategy objects.
 */
public class StrategyDesignPattern {
    static void main() {
        Navigator navigator = new Navigator(new RoadNavigation());
        navigator.navigate(new Point(0, 0), new Point(10, 10));
    }
}

/*
 * The strategy pattern (also known as the policy pattern) is a software design pattern that enables an algorithm's behavior to be selected at runtime.
 * The strategy pattern encapsulates alternative algorithms (or strategies) for a specific task and supports their interchangeable use.
 * The strategy pattern lets the algorithm vary independently of clients that use it.
 */

/*
 * Implementation
 */

/*
 * 1) Strategy interface - defines an algorithm interface common to all supported versions.
 */

interface NavigationStrategy {
    void navigate(Point from, Point to);
}

class Point {
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

/*
 * 2) Concrete Strategy classes - implement the algorithms using the Strategy interface.
 */

class RoadNavigation implements NavigationStrategy {
    @Override
    public void navigate(Point from, Point to) {
        System.out.println("Road Navigation: from = " + from + " to = " + to);
    }
}

/*
 * 3) Context class - maintains a reference to a Strategy object and defines an interface that lets the strategy access its data.
 */

class Navigator {
    private final NavigationStrategy strategy;

    public Navigator(NavigationStrategy strategy) {
        this.strategy = strategy;
    }

    public void navigate(Point from, Point to) {
        strategy.navigate(from, to);
    }
}

/*
 * Recap
 * - The strategy pattern encapsulates alternative algorithms (or strategies) for a specific task and supports their interchangeable use.
 * - Implementing it in place violates the open-closed principle and makes the code harder to maintain.
 * - Inheritance is static, and we cannot change the behavior of the system at runtime.
 * - To use the strategy pattern we create a strategy interface and a set of classes that implement it.
 * - The context class maintains a reference to a strategy object and delegates the work to it.
 */
