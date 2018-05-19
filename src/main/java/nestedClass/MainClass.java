package nestedClass;

public class MainClass {

	public static void main(String[] args) {
		OuterClass outerClassObj = new OuterClass();
		
		OuterClass.InnerClass_1 innerClassObj = outerClassObj.new InnerClass_1();

	}

}
