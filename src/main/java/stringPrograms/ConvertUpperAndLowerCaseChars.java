package stringPrograms;

public class ConvertUpperAndLowerCaseChars {

	public static void main(String[] args) {
		String input = "DhInEsH";
		StringBuilder output = new StringBuilder(input.length());
		int i;
		for(i=0; i<input.length();i++) {
			char a = input.charAt(i);
			char b = 0;
			if(a >=65 && a <=90) {
				b = (char) (a + 32);
			}
			
			else if(a >=97 && a<=122) {
				b = (char) (a-32);
			}
			
			output = output.append(b);
		}
		System.out.println(output);
	}

}
