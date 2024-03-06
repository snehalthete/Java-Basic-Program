//Write a Java program to create a class called "Rectangle" with width and height attributes.
//and Calculate the area and parimeter of the rectangle.
package com.classdemo;
import java.util.Scanner;

public class Rectangle {
	static int h;
	static int w;
		 static void perimeter(int h, int w)
		    { 
		        // Calculate the 'perimeter' using the formula
		        int perimeter = 2 * (h + w);
		       
		        System.out.println("The perimeter of rectangle height: "
		            + h + " and width: " + w + " = "
		            + perimeter);
		    }
		 static void area(int h, int w)
		    {
		        // Calculate the 'area' using the formula
		        int area = h * w;
		       
		        System.out.println("The area of rectangle:  "+area);
		    }
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height");
		h=sc.nextInt();
		System.out.println("Enter width");
		w=sc.nextInt();
		Rectangle.perimeter(h , w);
		Rectangle.area(h, w);
	}
	

}