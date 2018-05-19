package nestedClass;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		OuterClass obj = new OuterClass() {
			public void methodToCallAnonymousClass() {
			System.out.println("This is anonymous class implementation");	
			}
		};
		//obj.methodToCallAnonymousClass();

	}

}
