//package com.classdemo;
//
//public class StaticDemo {
//
//	static  int a=0; //static variable;
//	  int b; //instance variable
//	 
//		public void display()
//		{
//         a++;
//         System.out.println(a);
//         
//	    }
//	
//		public static void main(String[] args) {
//			
//			StaticDemo sd1=new StaticDemo();
//			sd1.display();
//			StaticDemo sd2=new StaticDemo();
//			sd2.display();
//			StaticDemo sd3=new StaticDemo();
//			sd3.display();
//		}
//}
//package com.classdemo;
//
//public class StaticDemo {
//
//	static  int a=0; //static variable;
//	  int b; //instance variable
//	 
//	static	public void display()
//		{
//		int c=0; // local method
//         a++;
//         System.out.println(a);
//         
//	    }
//	
//		public static void main(String[] args) {
//			
//			
//			display();
//			
//			display();
//			
//			display();
//		}
//}

//static block demo method
package com.classdemo;

public class StaticDemo {
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
