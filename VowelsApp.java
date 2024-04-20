package ExceptionLab.org;
import java.util.*;

public class VowelsApp 
{
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputString = sc.nextLine();
	       
	        try 
	        {
	            checkForVowels(inputString);
	            System.out.println("String contains vowels.");
	        } 
	        catch (NoVowelsException e)
	        {
	            System.out.println(e.getMessage());
	        }
	    }

	    public static void checkForVowels(String str) throws NoVowelsException 
	    {
	        boolean hasVowels = false;
	        for (char ch : str.toCharArray())
	        {
	            if (isVowel(ch)) 
	            {
	                hasVowels = true;
	                break;
	            }
	        }
	        if (!hasVowels) 
	        {
	            throw new NoVowelsException("String does not contain any vowels.");
	        }
	    }

	    public static boolean isVowel(char ch)
	    {
	        ch = Character.toLowerCase(ch);
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }

	    static class NoVowelsException extends Exception
	    {
	        public NoVowelsException(String message) 
	        {
	            super(message);
	        }

	}

}
