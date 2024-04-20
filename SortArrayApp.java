//Write a Java program to sort a given array list.
package Lab.com;
import java.util.*;

public class SortArrayApp 
{
	public static void main(String[] args) 
	{
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner xyz = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = xyz.nextInt();
   
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            int num = xyz.nextInt();
            arrayList.add(num);
        }
        System.out.println("ArrayList before sorting: " + arrayList);
        
		/*
		 * Collections.sort(arrayList);                                                  //First method for sorting
		 * System.out.println("ArrayList after sorting: " + arrayList);
		 */
        
		
		 int size = arrayList.size();                                                   // Second method for sorting
		 for (int i = 0; i < size - 1; i++)
		 { 
			 for (int j = 0; j < size - i - 1; j++) 
		     { 
				 if (arrayList.get(j) > arrayList.get(j + 1)) 
				 {
		              int temp = arrayList.get(j); 
		              arrayList.set(j, arrayList.get(j + 1));
		              arrayList.set(j + 1, temp); 
		          } 
			 }
		 }
		 System.out.println("ArrayList after sorting: " + arrayList);
		 

	}

}
