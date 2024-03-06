//package com.demo;
//
//public class ExampleMin {
//	
//      public float minFunction(double n, int m) //n=a, m=b
//      {// if m is min then return true and if n is min then result false
//    	  double min;
//    	  //n*m=3.5*9=31.5
//    	  if(n>m)
//    	  {
//    		  min=m;
//    	  }
//    	  else {
//    		  min= n;
//    	  }
//    	  return (float) min;
//      }
//      
//      public static void main(String[] args) {
//    	  
//    	  ExampleMin ex=new ExampleMin();
//    	  double result=ex.minFunction(3.5,9);
//    	  System.out.println("Minimum Value: " + result);
//      }
//      
//}


//package com.demo;
//
//public class ExampleMin {
//	
//      public boolean minFunction(int n, int m) //n=a, m=b
//      {// if m is min then return true and if n is min then result false
//    	  boolean min;
//    	  //n*m=3.5*9=31.5
//    	  if(n>m)
//    	  {
//    		  min=true;
//    	  }
//    	  else {
//    		  min=false;
//    	  }
//    	  return min;
//      }
//      
//      public static void main(String[] args) {
//    	  
//    	  ExampleMin ex=new ExampleMin();
//    	  boolean result=ex.minFunction(5,9);
//    	  System.out.println("Minimum Value: " + result);
//      }
//      
//} 



package com.demo;

public class ExampleMin {
	
      public char minFunction(char n, int m) //n=a, m=b
      {// if m is min then return true and if n is min then result false
    	  int min;
    	  //n*m=3.5*9=31.5
    	  if(n>m)
    	  {
    		  min=m;
    	  }
    	  else {
    		  min=n;
    	  }
    	  return (char)min;
      }
      
      public static void main(String[] args) {
    	  
    	  ExampleMin ex=new ExampleMin();
    	  
		char d = 0;
		char result=ex.minFunction(d,9);
    	  System.out.println("Minimum Value: " + result);
      }
      
}
