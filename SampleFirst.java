package com.classdemo;

class sample{
	int x=5;
}


public class SampleFirst {
	int  x=10; //instance variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleFirst sf1=new SampleFirst();
		sf1.x=40;
	     System.out.println(sf1.x);
		SampleFirst sf2=new SampleFirst();
		System.out.println(sf2.x);
		//sample sm=new sample();
		//System.out.println(sf1.x);
		//System.out.println(sf2.x);
		//System.out.println(sm.x);
	}

}
