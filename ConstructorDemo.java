package com.classdemo;

public class ConstructorDemo {
	public ConstructorDemo()// special type of method whose name of the constructor 
	{
		System.out.println("Constructor started:");
		
	}
    public static void show()
    {
    	System.out.println("Normal Method");
    }
	public static void main(String[] args) {
		//ConstructorDemo cs=new ConstructorDemo(); //object syntax
		@SuppressWarnings("unused")
		ConstructorDemo cs;// created reference of the class we have not allocated memory of the object 
		//cs.ConstructorDemo();
		//cs.show();
		ConstructorDemo.show();
	}

}
