package com.trng.d07;

import java.util.Date;

@SuppressWarnings("deprecation") // since most of the methods of Date class are depricated
public class DateClass {
    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println("Current Date and Time: " + currentDate);
        System.out.println("Current Date: " + currentDate.getDate());
        System.out.println("Current Month: " + currentDate.getMonth());
        System.out.println("Current Year: " + currentDate.getYear());
        System.out.println("Current Hour: " + currentDate.getHours());
        System.out.println("Current Minute: " + currentDate.getMinutes());
        System.out.println("Current Second: " + currentDate.getSeconds());

        // we can also use format specifiers --
        // %[argument_index$][flags][width][.precision]conversion
        System.out.printf("Current Date and Time: %1$tY/%1$tm/%1$td  %1$tH:%1$tM:%1$tS %Tp", currentDate);

        // Getting and setting time using getTime() and setTime() methods
        long timestamp = currentDate.getTime();
        System.out.println("Timestamp: " + timestamp);

        Date newDate = new Date();
        newDate.setTime(timestamp);
        System.out.println("New Date and Time: " + newDate);

        // Comparing dates using before(), after(), and equals() methods
        Date pastDate = new Date(2020, 0, 1); // January 1, 2020
        Date futureDate = new Date(2022, 0, 1); // January 1, 2022

        System.out.println("Is pastDate before currentDate? " + pastDate.before(currentDate));
        System.out.println("Is futureDate after currentDate? " + futureDate.after(currentDate));
        System.out.println("Are pastDate and futureDate equal? " + pastDate.equals(futureDate));

        // Formatting and parsing dates using toString() and deprecated methods
        String formattedDate = currentDate.toString();
        System.out.println("Formatted Date: " + formattedDate);

        Date parsedDate = new Date("Mon Jun 07 12:30:45 GMT 2023");
        System.out.println("Parsed Date: " + parsedDate);

    }
}
