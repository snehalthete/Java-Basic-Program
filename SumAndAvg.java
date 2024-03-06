//Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
//package com.demo;
//
//import java.util.Scanner;
//
//public class SumAndAvg {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int num1, num2, num3, num4, num5;
//		Scanner sc=new Scanner(System.in);
//		System.out.println(":");
//		
//
//		num1=sc.nextInt();
//		
//
//	}
//
//}
package com.demo;
import java.util.Scanner;
public class SumAndAvg {

    
  public static void main(String[] args)

{       
    int i,n=0,s=0;
	double avg;
	{
	   
        System.out.println("Input the 5 numbers : ");  
         
	}
		for (i=0;i<5;i++)
		{
		    Scanner in = new Scanner(System.in);
		    n = in.nextInt();
		    
  		s +=n;
	}
	avg=s/5;
	System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +avg);
 
}
}