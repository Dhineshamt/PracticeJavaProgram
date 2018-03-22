package practiceJavaProgram;

public class SingletonClass {
	
	static SingletonClass obj;
	int a = 10;
	private SingletonClass() {
	}	
	
	public static SingletonClass getInstance() {
		obj = new SingletonClass();
		return obj;
	}
	
	public void printSingleton(int a) {
		a= a+10;
		System.out.println(a);
	}

}
