package com.advanceJava.DesignPatterns.Behavioural;

import java.util.ArrayList;
import java.util.List;

public class ObserverDesignPattern {
    static void main() {
        WeatherStation weatherStation = new WeatherStation();
        Observer mobile  = new MobileDisplay();
        Observer tv = new TVDisplay();
        weatherStation.registerObserver(mobile);
        weatherStation.registerObserver(tv);
        weatherStation.setTemperature(20.3f);
        weatherStation.setTemperature(30.4f);
    }
}

interface Observer {
    void update(float temperature);
}

interface subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

class WeatherStation implements subject {

    private final List<Observer> observers = new ArrayList<>();
    private float temperature;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}

class MobileDisplay implements Observer {

    @Override
    public void update(float temperature) {
        System.out.println("Mobile Display: Temp = " + temperature);
    }
}

class TVDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("TV Display: Temp = " + temperature);
    }
}

/*
 * Key Points:-
 * Loose coupling: Subject doesn't know concrete observer implementations.
 * Push model: Subject pushes data (temperature) to observers.
 * Easy to add/remove observers at runtime.
 */
