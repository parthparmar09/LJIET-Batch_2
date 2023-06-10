package com.trng.d11;

//Run-time polymorphism
//Subclasses can have the methods of same name 
//Must accept same type/number of args and have same return type

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog is fetching");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        // Upcasting - access the members of superclass, actual object is of subclass
        Animal animal2 = new Dog();
        System.out.println(animal2.getClass());// Belongs to the Dog class but has only members of Animal class
        animal2.makeSound();// "Dog barks" -- can't have fetch() method from Dog
    }
}
