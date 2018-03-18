package stringPrograms;

import java.util.Arrays;

public class StringSize {

	public static void main(String[] args) {
		String name = "Jai Gurudev";
		int j = 0;
		
		char[] result = new char[name.length()];
		char[] charArray = name.toCharArray();
		
		Arrays.sort(charArray);
		
		for(int i = 0; i < charArray.length; i++) {
			if(charArray[i] != charArray[i+1]) {
				result[j] = charArray[i];
				j++;
				continue;
			}
			
			else {
				i+=2;
			}
		}
		
		for(char res:result) {
			System.out.print(res);
		}
	}

}
