package com.trng.d10;

//FunctionalInterface - has only one abstract method - often used with lambda expressions
interface Calculator {
    int calculate(int a, int b);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        // Lambda expression usage
        Calculator addition = (a, b) -> a + b;// implementing the object with method

        // Method invocation
        int result = addition.calculate(5, 3);// will return 5 + 3
        System.out.println(result);
    }
}
