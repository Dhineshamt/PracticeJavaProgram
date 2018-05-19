package nestedClass;

public class OuterClass {
	
	private String privateString = "I am a priavte string located under the scope of outer class. Can Inner class use me?";
	
	private void methodOfOuterClass() {
	System.out.println("This is method of outer class");
	}

	
	class InnerClass_1{
		
		public void methodToCallAnonymousClass() {
			
		}
		
		private void displayInnerClass1() {
			System.out.println("I am a method belong to Inner Class-1");
			
			System.out.println(privateString + "\nYes.Inner class can use you though you are private");
				
		}
		
		InnerClass_1() {
			OuterClass obj = new OuterClass();
			obj.methodOfOuterClass();
		}
		class inner{
			private void methodOfOuterClass() {
				System.out.println("This is method of Inner's inner class");
				}
			
		}
	}
	
	class InnerClass_2{
		public void displayInnerClass2() {
			System.out.println("I am a method belong to Inner Class-2");
		}
	}
	
	public static void main(String args[]) {
		OuterClass outerObj = new OuterClass();
		OuterClass.InnerClass_1 inner1Obj = outerObj.new InnerClass_1();
		OuterClass.InnerClass_1.inner obj = inner1Obj.new inner();
		obj.methodOfOuterClass();		
	}
	
	OuterClass outerObj = new OuterClass();
	OuterClass.InnerClass_1 inner1Obj = outerObj.new InnerClass_1();
	
}
