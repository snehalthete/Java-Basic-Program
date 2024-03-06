package com.classdemo;

public class ExampleminNumber {
	//access specifier return type name of the function(parameter list)
   //void, int, float, double, byte, boolean,..so on all 8 types of data
	 public int minFunction(int n, int m) //n=a, m=b
	 {
		 int min;
		 if(n>m)
		 {
			 min=m;
			// System.out.println("the minimum value is"+m);
		 }
		 else
		 {
			 min=n;
			// System.out.println("the minimum value is"+n); 
		 }
		return min;
	 }
	public static void main(String[] args) {
   
    int a=11;
    int b=6;
   ExampleminNumber eg= new ExampleminNumber();
   
   int c=eg.minFunction(a,b); //calling mathod
   System.out.println("Minimum Value"+c);
   }

}
