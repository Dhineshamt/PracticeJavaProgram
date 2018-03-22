package practiceJavaProgram;

public class SingetonUser {

	public static void main(String[] args) {
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		
		
		obj1.printSingleton(10);
		obj2.printSingleton(10);
		

	}

}
