//static block demo method
package com.classdemo;

public class StaticBlockDemo {
	static int staticVariable;
	static {
		  System.out.println("Static component SIB (ststic Initialization Block)");
          staticVariable=10;
	}
  static void staticMethod()
  {
	  System.out.println("From static method");
	  System.out.println(staticVariable);

  }
public class MainClassStatic{
	static{
		  System.out.println("Main class SIB");

	}
	public static void main(String[] args) {
		StaticBlockDemo.staticVariable=20;
		StaticBlockDemo.staticMethod();
	}

}
}
