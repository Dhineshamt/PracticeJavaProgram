package javaCollection;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationPractice {

	public static void main(String[] args) {
		
			Object output = new Object();
			Vector<Object> element = new Vector<>();
			element.add('a');
			element.add(10);
			element.add("Dhinesh");
			
			Enumeration<Object> elements = element.elements();
			while(elements.hasMoreElements()) {
				output = elements.nextElement();
				System.out.println(output);
			}
			
			int result;
			Vector<Integer> numbers = new Vector<>();
			Enumeration number = numbers.elements();
			
			while(number.hasMoreElements()) {
				result = (int) number.nextElement();
			}
			

	}

}
