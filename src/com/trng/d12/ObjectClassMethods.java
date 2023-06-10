package com.trng.d12;

//Object -  a gloabal/root class in java- inherited by all classes
//Provides several methods -
//1.toString() - returns a string representation of the object
//2.equals() - compares two objects for equality
//3.hashCode() - returns a hash code value for the object
//4.getClass() -  returns the runtime class of an object
//5.clone() - creates a shallow copy of an object (works with classes implementing Cloneable interface only)

class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectClassMethods {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("John Doe", 30);
        System.out.println(person.toString()); // 1
        System.out.println(person);// 1.toString() gets called implicitly

        Person person2 = new Person("John Dane", 30);
        System.out.println(person.equals(person2));// 2

        System.out.println(person.hashCode());// 3
        System.out.println(person.getClass());// 4

        Person person3 = (Person) person.clone();// 5
        System.out.println(person3);

    }
}
