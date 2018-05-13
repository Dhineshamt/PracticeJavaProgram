package practiceJavaProgram;

public class StaticBlock {
	
	static int i;

	static{
		//staticMethod();
		System.out.println("This is static block");
		//i = 10;
		
	}
	
	
	public static void staticMethod() {
		System.out.println("This is static method");
	}
	public static void main(String[] args) throws ClassNotFoundException {
		/*StaticBlock obj1 = new StaticBlock();
		StaticBlock obj2 = new StaticBlock();*/
		//StaticBlock.staticMethod();
		Class.forName("StaticBlock");
	}

}
