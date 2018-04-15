package javaCollection;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {

	public static void main(String[] args) {
		int j;
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i = 10;i>=1;i--) {
			numbers.add(i);
		}
		
		Iterator itr = numbers.iterator();
		
		while(itr.hasNext()) {
			j = (int) itr.next();
			
			if(j%2 == 0) {
				itr.remove();
			}
		}
		
		for(Integer number:numbers) {
			System.out.println(number);
		}

	}

}
