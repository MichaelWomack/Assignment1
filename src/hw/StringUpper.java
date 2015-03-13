/* Michael Womack
 * CS 3401
 * Homework 1 */

package hw;
import java.io.IOException;
import java.util.*;

public class StringUpper {
	
	static int upperCount = 0;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)  {
		
		String s;
		do{ 
			
			System.out.println("Enter a string:");
			s = input.nextLine();
			
		}while(s.isEmpty());
	
		System.out.println("The number of uppercase letters is " + 
							numUpper(s));
	}
	
	
	public static int numUpper(String s){
		if (s == null)
			throw new IllegalArgumentException("A null string was entered.");
		
		if (Character.isUpperCase(s.charAt(s.length()-1)))
				upperCount++;
		
		if (s.length() == 1)
			return upperCount;
		else 
			return numUpper(s.substring(0, (s.length()-1)));
					 	
	}	
}
