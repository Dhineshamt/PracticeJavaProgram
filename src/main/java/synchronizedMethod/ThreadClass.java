package synchronizedMethod;

public class ThreadClass extends Thread {

	public static void main(String[] args) {
		SynchronizedMethod obj1 = new SynchronizedMethod();
		SynchronizedMethod obj2 = new SynchronizedMethod();
		
		obj1.synchMethod();
		obj2.synchMethod();
		
		

	}

}
