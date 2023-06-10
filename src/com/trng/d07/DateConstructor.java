package com.trng.d07;

import java.util.Scanner;

public class DateConstructor {

	int date, month, year;

	public DateConstructor() {
		this.date = 2;
		this.month = 6;
		this.year = 2023;
	}

	public DateConstructor(int date, int month) {
		this.date = date;
		this.month = month;
	}

	public DateConstructor(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public void getData() {
		System.out.println("The day is " + this.date);
		System.out.println("The month is " + this.month);
		System.out.println("The year is " + this.year);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		DateConstructor d1 = new DateConstructor();

		System.out.println("Data of D1 :");
		d1.getData();

		System.out.println("Enter the day for d2 :");
		int day2 = sc.nextInt();
		System.out.println("Enter the month for d2 :");
		int mnt2 = sc.nextInt();
		DateConstructor d2 = new DateConstructor(day2, mnt2);
		System.out.println("Data of D2 :");
		d2.getData();

		System.out.println("Enter the day for d3 :");
		int day3 = sc.nextInt();
		System.out.println("Enter the month for d3 :");
		int mnt3 = sc.nextInt();
		System.out.println("Enter the year for d3 :");
		int yr3 = sc.nextInt();

		DateConstructor d3 = new DateConstructor(day3, mnt3, yr3);
		System.out.println("Data of D3 :");
		d3.getData();

		sc.close();
	}

}
