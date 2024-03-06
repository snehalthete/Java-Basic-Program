//Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
package com.demo;
import java.util.*;

public class FindWeekday {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	   
		String dayName=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1 to 7:");
		int day =sc.nextInt();
		System.out.println(getDayName(day));
		
	}
		
		 public static String getDayName(int day) {
		        String dayName = "";
		        switch (day) {
		            case 1: 
		            	   dayName = "Monday";
		                   break;
		            case 2: 
		            	   dayName = "Tuesday"; 
		            	   break;
		            case 3: 
		            	   dayName = "Wednesday"; 
		            	   break;
		            case 4:
		            	   dayName = "Thursday"; 
		            	   break;
		            case 5:
		            	   dayName = "Friday"; 
		            	   break;
		            case 6:
		            	   dayName = "Saturday"; 
		            	   break;
		            case 7: 
		            	   dayName = "Sunday"; 
		            	   break;
		            default:
		            	   dayName = "Invalid day range";
		        }

		        return dayName;
		    }
		}