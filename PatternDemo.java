/*
 * 1
 * 22
 * 333
 * 4444
 * 
 * 
 * rows is set to 4
 * outer loop start with i=1
 * inner loop run from j=1 to j=i(1) printing the number from 1 to i
 * outer for i=1
 * move to the next line
 * 
 * outer loop continous  to i=2
 *  inner loop run from j=1 to j=i(1) printing the number from 1 to i
 * outer for i=2 2,2
 * move to the next line
 */
package com.demo;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int rows= 4;
      // outer for loop
      for(int i=1; i<=rows; i++)
      {
    	// inner loop for printing the number
    	  for(int j=1; j<=i; j++)
    	  {
    		  System.out.print(i+" ");
    	  }
    	  
		// move to next line after each row
    	   System.out.println();
      }
      
	}

}
