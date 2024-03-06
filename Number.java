//Task 1. Write a Java program to get a number from the user and print whether it is positive or negative
package com.demo;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		int num;
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		num=sc.nextInt();
		if(num > 0)
		{
			System.out.println("Number is positive ");
		}
		else if(num < 0) {
			System.out.println("Number is negative ");
		}
		else{
			System.out.println("Number is zero ");
		}
	}

}
