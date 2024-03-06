package com.demo;

public class ArrayInJava4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {12,21,0,5,7};
		int[] b= a.clone();
		for(int i=0; i<b.length;i++)
		{
			System.out.println(b[i]);
			
		}
		a[2]= 56;
		System.out.println("======================");
		System.out.println(b[2]);
		
		b[4]= 45;
		System.out.println(b[4]);
	}

}
