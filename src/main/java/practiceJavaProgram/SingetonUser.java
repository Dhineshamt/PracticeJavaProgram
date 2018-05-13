package practiceJavaProgram;

public class SingetonUser {

	public static void main(String[] args) {
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		/*obj1.printSingleton(10);
		obj2.printSingleton(10);*/
		

	}

}
