/** Michael Womack
 *  CS 3401
 *  Homework 1 */

package hw;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		
		int x = 5;
		String binary = toBinary(x);
		System.out.println(x + " in binary is " + binary + ".");
	}
	
	public static String toBinary(int n){
		String binary = "";
		return toBinary(n, binary);
					
	}
	
	private static String toBinary(int n, String binary){

		if (binary == null)
			throw new IllegalArgumentException("Binary string is null!");
		
		if (n % 2 == 0)
			binary = "0" + binary;
		else
			binary = "1"  + binary;
		
		n /= 2;
		if (n != 0)
			return toBinary(n , binary);
		else 
			return binary;
			
	}
}
