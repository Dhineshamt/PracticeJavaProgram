package learnCollection;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class LearnHashMapMethods {

	public static void main(String[] args) {
		
		//Declaring hashmap variable
		Map<Integer, String> learnMap = new HashMap<>();
				
		//put() method. This method will put details into map in key, value pair
		learnMap.put(1, "One");
		learnMap.put(2, "Two");
		learnMap.put(3, "Three");
		
		//get(key) method. This method will get value of the key which is passed as parameter
		String one = learnMap.get(1);
		System.out.print("Output of get(key) method is: ");
		System.out.println(one);
		
		
		//keySet() method. This method will return all the keys of given hashmap as Set. 
		Set<Integer> numberKeys = learnMap.keySet();
		System.out.println("Output of keySet() method is: ");
		for(Integer number: numberKeys) {
			System.out.println(number);
		}
		
		
		//entrySet() method. This method will return both the key and value pair as set. 
		Set<Map.Entry<Integer, String>> allSetOfNumbers = learnMap.entrySet();
		System.out.println("Output of entrySet() method: ");
		for(Map.Entry<Integer, String> eachNumber: allSetOfNumbers) {
			System.out.println(eachNumber.getKey()+" : " +eachNumber.getValue());
		}
		
		
	}

}
