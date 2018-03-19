package practiceJavaProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class B {
	public void testMethod() {	
	}	
	
	public static void main (String args[]) {
		Map<String,ArrayList<String>> addElmt = new HashMap<>();
		
		ArrayList<String> elmtAdd = new ArrayList<>();
		
		elmtAdd.add("Dhinesh");
		elmtAdd.add("Dhiva");
		
		
		addElmt.put("Dhines", elmtAdd);
		
		elmtAdd.clear();
		
		System.out.println(addElmt);
	}
}