package stringPrograms;

public class ReverseString {

	public static void main(String[] args) {		
		String name = "Dhinesh", reversedString="";
		for(int i=name.length()-1;i>=0;i--){
			reversedString = reversedString + name.charAt(i);
			
		}
		System.out.print(reversedString);
	}
	
	
/*
 * Above program is to reverse a string using charAt() method
 * 
 * Pseudo code
 * 1. Declare a string that needs to reversed and initialize it 
 * 		String name = "Dhinesh";
 * 
 * 2. Run for loop from last character of string to first character. 
 * 		Notes:  Use length() method to find no of characters in the string.
 * 				 
 * 		for(i = name.length()-1; i>=0;i--)
 * 
 * 3. Function to perform inside loop.
 * 		Print character using charAt() method. the index inside charAt() will be the value of i from loop
 * 		syso(name.charAt(i))
 *  	
 */

}
