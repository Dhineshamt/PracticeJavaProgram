package arraysClass;

import java.util.Arrays;

public class ArraysSortByChar {

	public static void main(String[] args) {
		char[] characters = new char[5];
		
		char[] charArray = {'m','a','r','b'};
		char[] sortedArray = new char[charArray.length];
		
		for(int i=0; i<=4; i++) {
			characters[i] = (char) ((char) 97+i);
		}
		
		System.out.println(Arrays.toString(characters));
		
		System.out.println(Arrays.toString(charArray));
		Arrays.sort(charArray);
		
		System.out.println(Arrays.toString(charArray));
	}

}



