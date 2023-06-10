package com.trng.d08;

//class can have only one direct parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car accelerating");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.accelerate();
    }
}
