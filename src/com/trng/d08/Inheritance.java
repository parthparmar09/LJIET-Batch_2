package com.trng.d08;

//Inheritance - a mechanism that allows classes to inherit properties and behaviors from other classes
// inherited classes will have all members from the parent class -  can also have their own members
class Shape {
    public void draw() {
        // Implementation to draw a shape
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        // Implementation to draw a circle
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        // Implementation to draw a rectangle
    }
}

public class Inheritance {

}
