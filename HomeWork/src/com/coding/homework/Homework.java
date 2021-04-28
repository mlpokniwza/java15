package com.coding.homework;

import java.util.Scanner; 

public class Homework {
	public static void main(String[] args) {
		// Lab 6
		// 6.1
		int i = 8;
		while (i <= 10) {
			System.out.print(i  + " ");
			i++;
		}
		System.out.println();
		// 6.2
		int sum1 = 0;
		for(int count=0; count<10; count++) {
			sum1 += count;
		}
		System.out.println(sum1);
		// 6.3
		int sum2 = 0;
		for(int count=1; count<=100; count++) {
			if(count % 12 == 0) {
				sum2 += count;
			}
		}
		System.out.println(sum2);
		// 6.4
		int myArray[] = {1, 2, 3, 4, 5};
		for(int counter : myArray) {
			System.out.print(counter + " ");
		}
		System.out.println();
		
		// Lab 7
		// 7.1
		int myCount = 20;
		do {
			System.out.print(myCount + " ");
			myCount--;
		}while(myCount >= 1);
		System.out.println();
		// 7.2
		Scanner myScan = new Scanner(System.in);
		System.out.print("Input number : ");
		int myInput = myScan.nextInt();
		do {
			if(myInput % 2 == 1) {
				break;
			}
			System.out.print("Input number : ");
			myInput = myScan.nextInt();
		}while(true);
		
		// Lab 8
		for(int count=20; count>0; count--) {
			System.out.print(count + " ");
			if(count == 11) {
				break;
			}
		}
		
	}
}
