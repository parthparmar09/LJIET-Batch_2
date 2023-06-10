package com.trng.d08;

//chaining of inheritance, one class serves as the superclass for another class, and so on.

class Animal {
    void eat() {
        System.out.println("Animal eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barking");
    }
}

class Bulldog extends Dog {
    void sleep() {
        System.out.println("Bulldog sleeping");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Bulldog bulldog = new Bulldog();
        bulldog.eat();
        bulldog.bark();
        bulldog.sleep();
    }
}
