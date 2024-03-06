package com.demo;

import java.util.Scanner;

/* switch(expression)
{
  case value:
	//execute the statement
  break;
  case value:
		//execute the statement
		break;
  case value:
		//execute the statement
		break;
  default:
		//execute the statement*/

public class CoffeeMachine 
{
 public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose your coffee");
		System.out.println("1. NESCAFE");
		System.out.println("2. BRU");
		System.out.println("3. Americano");
		System.out.println("4. Latte");	
	  int choice=sc.nextInt();
	 switch(choice)
	 {
	  case 1:
		System.out.println("You choose the NESCAFE, Price is 20");
		break;
	  case 2:
		System.out.println("You choose the BRU, Price is 15");
		break;
	  case 3:
		System.out.println("You choose the Americano, Price is 10");
		break;
	  case 4:
		System.out.println("You choose the Latte, Price 50");
		break;
	  default:
		System.out.println("Invalid Name, Price");
	
	 }
   }
}
