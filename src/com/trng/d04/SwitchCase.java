package com.trng.d04;

import java.util.*;

public class SwitchCase {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of days :");
		int days = sc.nextInt();
		String month = "";
		switch (days) {
			case 29:
				month = "February";
				break;
			case 30:
				month = "April";
				break;
			case 31:
				month = "January";
				break;
			default:
				System.out.println("Invalid Number of days");
		}

		if (month.length() > 0) {
			System.out.println("The month is " + month);
		}

		sc.close();

	}
}
