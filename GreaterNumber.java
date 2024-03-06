package com.demo;
import java.util.*;

public class GreaterNumber {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number:");
		System.out.println("Enter Second Number:");
		System.out.println("Enter Third Number:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("First Numberis greater");	
		}
		else if(num2>num1 && num2>num3){
			System.out.println("Second Number is greater");
		}
		else {
			System.out.println("Third Number is greater");
		}
	}

}
