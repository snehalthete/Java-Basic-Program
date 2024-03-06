//Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run the program

package com.classdemo;

public class Car {
	
	public  void speed(int n) {
		
	 System.out.println("The car gives the speed:"+n);
	      
	}

	public void fullThrottle() {
		
         System.out.println("The car is going to fast it can!");
	    
	}

public static void main(String[] args) {
	Car mycar=new Car();
	 mycar.fullThrottle();
	 mycar.speed(200);
	}
}
