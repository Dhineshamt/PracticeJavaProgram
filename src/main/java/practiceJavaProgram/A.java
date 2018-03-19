package practiceJavaProgram;

import java.io.IOException;

public class A {	
	public void publicMethod() throws IOException{
		System.out.println("This is public method");
	}
	
	public void dhinesh() {
		 System.out.println("This is Dhinesh method");
	}
	
	
	public static void main(String args[]){
		
		A obj = new A();
		System.out.println("Hash Code: "+obj.hashCode()+ "  To String value: "+ obj.toString()  );	
		
		int i[] = new int[5];
		
		String input[] = new String[10];
		
		input[0] = "Dhinesh";
		input[2] = "Iliyas";
		
		System.out.println(input[0]);
		
		float input1[] = new float[5];
		
		int k = 0;
		for(int i1=0;i1<=input1.length-1;i1++){
			
			input1[i1] = k;
			k = k + 2;
		}
		
		
		System.out.println(input1[4]);
		
		
		
	}
}
