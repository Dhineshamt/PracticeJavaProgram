package learnCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiffBetweenCollectionAndCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(5);
		numbers.add(6);
		numbers.add(5);
		numbers.add(2);
		numbers.add(8);
		numbers.add(4);
		numbers.add(3);
		numbers.add(5);
		numbers.add(20);
		numbers.add(11);
		numbers.add(10);
		numbers.add(12);		
		
		System.out.println("       ");
		
		Collections.sort(numbers);
		
		String input = numbers.toString();
		
		System.out.println(input);
		
		System.out.println(numbers.get(0));
		
	}
}
