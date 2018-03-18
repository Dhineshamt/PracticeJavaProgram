package stringPrograms;

public class FindVowelsAndConsonents {

	public static void main(String[] args) {
		String name = "Dhinesh";
		
		char[] charArray = name.toCharArray();
		int i = 0, j=0;
		
		for(char character: charArray) {
			
			if(character == 'a') {
				i++;
			}
			
			else if(character == 'e' || character == 'i' || character == 'o' || character == 'u' ) {
				j++;
			}
			}
			
			System.out.println("Number of vowels in string is: "+i +"  No of consonants: "+j);
		}
}