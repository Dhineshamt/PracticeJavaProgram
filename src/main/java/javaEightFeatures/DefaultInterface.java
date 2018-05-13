package javaEightFeatures;

public interface DefaultInterface {
	
	default void defaultInterface() {
		System.out.println("This is Default interface");
	}
	
	void regularInterface();

}
