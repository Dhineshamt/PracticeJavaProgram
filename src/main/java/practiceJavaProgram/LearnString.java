package practiceJavaProgram;

public class LearnString {

	public static void main(String[] args) {
		/*int i = 2;
		String name = "Dhinesh";
		System.out.println(name.hashCode());
		
		char ch[]= {'a','b'};
		String charCheck = new String(ch);
		name = name+"Iliyas";
		System.out.println(name.hashCode());
		
		System.out.println(name);
		
		StringBuilder name1 = new StringBuilder("Dhinesh");
		System.out.println(name1.hashCode());
		name1=name1.append('a');		
		System.out.println(name1);
		
		System.out.println("Address of object after change" + name1.hashCode());
		
		StringBuffer obj = new StringBuffer("Dhinesh");
		obj.reverse();*/
		
		/*String name = "Dhinesh";
		int i = name.hashCode();
		name = name + "Anbalagan";
		if( == name2){} */
		
		StringBuilder one = new StringBuilder("Dhinesh");
		StringBuilder two = one.append(" anbalagan");
		
		if(one == two) {
			System.out.println("True : Hash code of one :" +one.hashCode() +"  Hash code of two :"+two.hashCode());
			System.out.println(two);
			System.out.println(one);
			
			
		}
		else
			System.out.println("False");
		
		
		
	}

}
