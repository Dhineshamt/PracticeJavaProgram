package practiceJavaProgram;

public class LogException {

	public static void main(String[] args) {
		int a;
		//a=10/0;
		
		try {
			a = 10/0;
			 
			
			
		} catch(ArithmeticException e) {
		System.out.println(e.getMessage());
		}
		

	}

}
