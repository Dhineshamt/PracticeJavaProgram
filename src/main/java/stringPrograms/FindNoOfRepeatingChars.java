package stringPrograms;

import java.util.Scanner;

public class FindNoOfRepeatingChars {

	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		String inputString = input.next(), verifiedChars = null;
		int occurrenceOfChars = 0;
		char charToCompare, charToBeCompared;
		
		for(int i=0; i<=inputString.length()-2;i++){
			charToCompare = inputString.charAt(i);
			verifiedChars = verifiedChars + charToCompare;
			if(inputString.substring(i+1).indexOf(charToCompare) != -1)
			{
				if(verifiedChars.indexOf(charToCompare) != -1)
				{
					for(int j=i+1; j < inputString.length()-1;j++){
						charToBeCompared = inputString.charAt(j);
						if(charToCompare == charToBeCompared){
							occurrenceOfChars = occurrenceOfChars + 1;
						}
						
						
					}
				}
					
			}
			
			
		}*/
		
		
		    String s="aaaaabbbbbcccccgbg";
		    int distinct = 0 ;

		    for (int i = 0; i < s.length(); i++) {

		        for (int j = 0; j < s.length(); j++) {

		            if(s.charAt(i)==s.charAt(j))
		            {
		                distinct++;

		            }
		        }   
		        System.out.println(s.charAt(i)+"--"+distinct);
		        String d=String.valueOf(s.charAt(i)).trim();
		        s=s.replaceAll(d,"");
		        distinct = 0;

		    }

		}
		
		

	}

