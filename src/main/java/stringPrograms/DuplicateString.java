package stringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		String duplicateString = "Operation";
		
		char[] charArray = duplicateString.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<>();
		
		for(char character: charArray) {
			if(charMap.containsKey(character)) {
				charMap.put(character, charMap.get(character)+1);
			}
			
			else 
				charMap.put(character, 1);
		}
		
		Set<Map.Entry<Character,Integer>> entryset = charMap.entrySet();
		
		for(Map.Entry<Character, Integer> dupChar: entryset) {
			if(dupChar.getValue() > 1) {
				System.out.println(dupChar.getKey() + " repeated for " +dupChar.getValue() + " times");
			}
		}
	}

}
