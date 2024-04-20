//Write a Java program to count the number of key-value (size) mappings in a map.
package Lab.com;
import java.util.*;

public class CountNoMappingApp 
{
	public static void main(String[] args)
	{
        Map<String, Integer> map = new HashMap<>();
        
        map.put("kalpesh", 3);
        map.put("Snehal", 9);
        map.put("tushar", 2);
        map.put("bharat", 6);
        map.put("gokarn", 12);
        
        int size = map.size();
        System.out.println("Number of key-value mappings in the map: " + size);
		

	}

}
