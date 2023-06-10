package com.trng.d08;

//superclass has multiple subclasses that inherit its properties and behaviors

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

    }
}
