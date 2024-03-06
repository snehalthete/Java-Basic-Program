package com.demo;

public class ArrayInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /*  int[] a= {12,21,0,5,7};
     int[] b=a;
     //printing the data
     for(int i=0; i<b.length; i++) //1 i.e is 1<5
    	 System.out.println(b[i]);  //b[1]= 12, 21..so on
    a [2]= 52; // changing the calue of 3rd element of array
    System.out.println(b[2]);
    b [4]= 100; // changing the calue of 3rd element of array
    System.out.println(a[4]);
    
     */
    
		int[] a= {12,21,0,5,7};
	     int[] b=new int[a.length];
	     for(int i=0; i<a.length; i++) // copying array
	     {
	    	 b[i]= a[i];
	    	 System.out.println(b[i]);
	     }
          a [2]= 56; // changing the calue of 3rd element of array
          System.out.println(b[2]);
          b [4]= 100; // changing the calue of 3rd element of array
          System.out.println(a[4]); //changing calue of 5th ement in b
}
}