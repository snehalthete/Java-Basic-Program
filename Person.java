//Write a Java program to create a class called "Person" with a name and age attribute. 
//Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age

package com.classdemo;


public class Person {
	String Name;
	int Age;
	public Person(String Name, int Age)
	{
		this.Name=Name;
		this.Age=Age;
	}
	public String getName() {
		return Name;
	}
	public int getAge() {
		return Age;
	}	
	
	public static void main(String[] args) {	
		
	     Person p= new Person("Pramod", 23);
		   
		    System.out.println(p.getName() + " is " + p.getAge() + " years old.");
		   
	}

}
