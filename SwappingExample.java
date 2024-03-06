//package com.demo;
//
//public class SwappingExample {
//
//	public int swapFunction(int a, int b) {
//		int temp;
//		temp=a;
//		return a=b;
//		
//	}
//	public static void main(String[] args) {
//		int a=10;
//		int b=30;
//		System.out.println("Before Swapping a=" +a+ "and b=" +b);
//		// calling the swap method
//		SwappingExample se=new SwappingExample();
//		int temp= se.swapFunction(a,b);
//		System.out.println("Now , Before");
//
//	}
//
//}


package com.classdemo;
import java.util.*;

public class SwappingExample {

	public void swapFunction(int a, int b) {
		int temp;
		temp=a;
	    a=b;
	    b=temp;
	    System.out.println("The value of a is: "+a);
	    System.out.println(" The value of a is:"+b);
	    	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a ");
		// calling the swap method
		int a=sc.nextInt();
		System.out.println("Enter the value of b ");
		int b=sc.nextInt();
		SwappingExample sx=new SwappingExample();
		  sx.swapFunction(a,b);
		
	}

}
