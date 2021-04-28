package com.coding.homework;

import java.util.Scanner; 

public class Homework {
	public static void main(String[] args) {
		// Lab 9
		for(int count=20; count>0; count--) {
			if(count == 11) {
				System.out.println(count);
				continue;
			}
			System.out.println("Counter : " + count);
		}
		
		// Lab 10
		for(int count=1; count<=10; count++) {
			if(count == 2) {
				continue;
			}
			System.out.print(count + " ");
		}
	}
}
