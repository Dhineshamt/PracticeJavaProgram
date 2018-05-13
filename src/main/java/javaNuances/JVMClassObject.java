package javaNuances;

import java.lang.reflect.Method;

public class JVMClassObject {

	public static void main(String[] args) {
		Student s1 = new Student();
		Class c1 = s1.getClass();
		
		String nameOfClass = c1.getName();
		System.out.println(nameOfClass);
		
		Method m[] = c1.getDeclaredMethods();
		for(Method method: m) {
			System.out.println(method.getName());
		}
		

	}

}
