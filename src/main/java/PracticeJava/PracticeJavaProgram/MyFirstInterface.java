package PracticeJava.PracticeJavaProgram;

public interface MyFirstInterface {
	
public void interface1();

public void interface2();

default void interface3(){
	System.out.println("This is Default method from Java 8");
} 

static void staticMethodInIntrface() {
	System.out.println("This is my static method");
}
}
