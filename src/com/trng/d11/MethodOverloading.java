package com.trng.d11;

//Compile-time polymorphism
//methods of same name in same class
//must accept different type or number of arguments - may have diff. return type
class Calculator {

    public int add(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public double add(double... a) {
        double sum = 0;
        for (double i : a) {
            sum += i;
        }
        return sum;
    }

}

public class MethodOverloading {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        System.out.println(c.add(1.0, 2.22, 3.33));
        System.out.println(c.add(1, 2, 3));
    }
}
