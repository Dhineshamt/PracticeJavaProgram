package abstractClass;

public class MainClass extends AbstractClass{
	
	public void abstractMethod() {
		System.out.println("I am abstract method");
	}
	

	public static void main(String[] args) {
		MainClass obj = new MainClass();
		obj.abstractMethod();
		obj.nonAbstractMethod();

	}

}
