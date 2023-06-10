package com.trng.d06;

//ENUM - enums in Java provide a way to define a set of related constants, enforce type safety, and improve code readability. 

public class EnumDemo {
    public enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        Day today = Day.MONDAY;

        System.out.println("Today is: " + today);

        // Switch statement with enum
        switch (today) {
            case MONDAY:
                System.out.println("It's the start of the week.");
                break;
            case FRIDAY:
                System.out.println("It's almost the weekend!");
                break;
            case SUNDAY:
                System.out.println("Enjoy your rest day.");
                break;
            default:
                System.out.println("It's a regular day.");
        }
    }
}
