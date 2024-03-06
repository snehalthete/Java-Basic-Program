package com.demo;
import java.util.Scanner;
public class Days {

	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		int day=3;
		String dayString=new String();  //String dayString;  this also we can write
	  switch(day)
	 {
	   case 1:
		      System.out.println("Monday");
		      break;
	   case 2:
		      System.out.println("Tuesday");
		      break;
	   case 3:
		      System.out.println("Wednesday");
		      break;
	   case 4:
		      System.out.println("Thursday");
		      break;
	   case 5:
		      System.out.println("Friday");
		      break;
	   case 6:
		      System.out.println("Saturday");
		      break;
	   case 7:
		      System.out.println("Sunday");
		      break;
	   default:
		      System.out.println("Invalid Day!");
	
	 }
   
            
	}

}

/*
  public static void main(String[] args)
    {
        int day = 5;
        String dayString;
 
        // Switch statement with int data type
        switch (day) {
 
        // Case
        case 1:
            dayString = "Monday";
            break;
 
        // Case
        case 2:
            dayString = "Tuesday";
            break;
 
            // Case
        case 3:
            dayString = "Wednesday";
            break;
 
            // Case
        case 4:
            dayString = "Thursday";
            break;
 
        // Case
        case 5:
            dayString = "Friday";
            break;
 
            // Case
        case 6:
            dayString = "Saturday";
            break;
 
            // Case
        case 7:
            dayString = "Sunday";
            break;
 
        // Default case
        default:
            dayString = "Invalid day";
        }
        System.out.println(dayString);
    }
}
 */
