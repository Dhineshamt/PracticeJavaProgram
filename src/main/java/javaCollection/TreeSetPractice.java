package javaCollection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		
		names.add("Dhinesh");
		names.add("Anbu");
		names.add("Indhirani");
		
		
		for(String name: names) {
			System.out.println(name);
		}
		
		Set<String> descending = names.descendingSet();
		
		for(String name: descending) {
			System.out.println(name);
		}
	}

}
