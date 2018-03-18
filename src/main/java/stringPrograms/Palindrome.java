package stringPrograms;

public class Palindrome {

	public static void main(String[] args) {
		String name = "madam";
		int length = name.length();
		String reversedString;
		
		char[] charArray;
		
		for(int i=length-1;length<=0;i--) {
			reversedString = reversedString.concat(name.charAt(length));
		}

	}

}
