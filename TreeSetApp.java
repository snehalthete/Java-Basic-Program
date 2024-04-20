//Write a Java program to find numbers less than 7 in a tree set.
package Lab.com;
import java.util.*;

public class TreeSetApp 
{
	public static void main(String[] args)
	{
        TreeSet<Integer> treeSet = new TreeSet<>();
        Scanner xyz = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = xyz.nextInt();
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
        {
            int num = xyz.nextInt();
            treeSet.add(num);
        }
       
        TreeSet<Integer> result = new TreeSet<>();
        for (Integer num : treeSet) 
        {
            if (num < 7) 
            {
                result.add(num);
            }
        }
        System.out.println("Numbers less than 7 in the TreeSet: " + result);
		

	}

}
