package com.advanceJava.DesignPatterns.Creational.Builder;

public class Client {
    static void main() {
        House house = House.builder().setRoof(true).setBathNumber(1).setKitchenNumber(3).setGarden(true).setRoomNumber(2).build();
        System.out.println(house);
    }
}
