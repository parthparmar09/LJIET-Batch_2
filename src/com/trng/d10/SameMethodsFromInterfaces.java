package com.trng.d10;

interface interface1 {
    default void doSomething() {
        System.out.println("first interface");
    }
}

interface interface2 {
    default void doSomething() {
        System.out.println("second interface");
    }
}

class ImplementInterface implements interface1, interface2 {
    public void doSomething() {
        interface1.super.doSomething();
        interface2.super.doSomething();
    }
}

public class SameMethodsFromInterfaces {
    public static void main(String[] args) {
        ImplementInterface ii = new ImplementInterface();
        ii.doSomething();
    }
}
