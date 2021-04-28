package com.coding.homework;

public class Homework {
	public static void main(String [] args) {
		int i = 20;
		for(int count=0; count<5; count++) {
			i++;
		}
		System.out.println(i);
		for(int count=0; count<5; count++) {
			i--;
		}
		System.out.println(i);
		
		System.out.println( 5.5f < 7.8f && 3.2f > 2.1f );
		
		System.out.println( 'a' == 'b' || 'b' == 'c' );
	}
}
