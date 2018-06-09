package stringPrograms;

public class CompareOperatorInString {

	public static void main(String[] args) {
		String name1 = new String("Falcon");
		String name2 = new String("Falcon");
		
		String name3 = "I am Dhinesh";
		String name4 = "I am Dhinesh";

		if (name1 == name2) {
			System.out.println("I am Falcon");
		} else
			System.out.println("I am not Falcon");

		if (name1.equals(name2)) {
			System.out.println("Believe me. I am Falcon");
		} else
			System.out.println("Sorry Guys. I am not Falcon");
		
		if(name3 == name4) {
			System.out.println("name3 and name4 are referring to same object since both the varialbes consist same string");
		} else
			System.out.println("name3 and name4 are not referring to same object");
		
	}

}
