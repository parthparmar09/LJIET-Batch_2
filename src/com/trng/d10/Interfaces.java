package com.trng.d10;

//Interfaces - contains abstract methods only -cant have instance variables or constructors - can have static vars/methods of its own
//methods are by default abstract and public
//can't override static/final methods

interface Vehicle {
    void start();

    // classes can override or use default methods as defined
    default void honk() {
        System.out.println("Beep beep!");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.honk();
    }

}
