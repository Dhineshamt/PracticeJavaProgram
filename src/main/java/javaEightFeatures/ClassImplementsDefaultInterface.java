package javaEightFeatures;

public class ClassImplementsDefaultInterface implements DefaultInterface{

	public void regularInterface() {
		System.out.println("This is Regular Interface");
	}
	
	public void defaultInterface() {
		System.out.println("This is implementation of default method");
	}
	public static void main(String args[]) {
		ClassImplementsDefaultInterface obj = new ClassImplementsDefaultInterface();
		
		obj.regularInterface();
		obj.defaultInterface();
	}
}