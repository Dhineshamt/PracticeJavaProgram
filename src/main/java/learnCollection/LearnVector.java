package learnCollection;

import java.util.Vector;

public class LearnVector {

	public static void main(String[] args) {
		Vector<Integer> list = new Vector<>(); 
		boolean added = list.add(1);
		list.add(2);
		
		System.out.println(added);
		
	}

}
