package learnCollection;
import java.util.Set;
import java.util.HashSet;

public class SetMethods {

	public static void main(String[] args) {
		
		Set<Integer> a = new HashSet<>();
		
		a.add(10);
		a.add(8);
		a.add(1);
		a.add(2);
		
		
		Set<Integer> b = new HashSet<>();
		b.add(2);
		b.add(3);
		b.add(8);
		
		Set<Integer> union = new HashSet<>(a);
		union.addAll(b);
		//union.forEach(num -> System.out.println(num));
		System.out.println(union);
		
		Set<Integer> intersection = new HashSet<>(a);
		intersection.retainAll(b);
		//intersection.forEach(num -> System.out.println(num));
		System.out.println(intersection);
		
		Set<Integer> difference = new HashSet<>(a);
		difference.removeAll(b);
		//difference.forEach(num -> System.out.println(num));
		System.out.println(difference);

	}

}
