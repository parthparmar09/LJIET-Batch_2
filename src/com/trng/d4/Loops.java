package com.trng.d4;

import java.util.Scanner;

public class Loops {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[10];
		//1.for loop
		for(int i = 0 ; i < arr1.length ; i++) {
			System.out.println("enter an integer for arr1["+i+"] :");
			arr1[i] = sc.nextInt();
		}
		System.out.println("------------------");
		
		
		//2. while loop
		int i = 0;
		while(arr1.length > i) {
			System.out.println(arr1[i]);
			i++;
		}
		System.out.println("------------------");
		
		
		//3. do while loop
		i = 0 ;
		do {
			System.out.println(arr1[i]);
			i++;
		}while(arr1.length > i);
		
		System.out.println("------------------");
		
		
		//4. for each loop - read only loop
		for( int j : arr1) {
			System.out.println(j);
		}
		System.out.println("------------------");
	}
}
