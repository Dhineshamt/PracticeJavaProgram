package stringPrograms;

public class CompareOperatorInString {

	public static void main(String[] args) {
		String name1 = new String("Falcon");
		String name2 = new String("Falcon");

		if (name1 == name2) {
			System.out.println("I am Falcon");
		} else
			System.out.println("I am not Falcon");

		if (name1.equals(name2)) {
			System.out.println("Believe me. I am Falcon");
		} else
			System.out.println("Sorry Guys. I am not Falcon");
	}

}
