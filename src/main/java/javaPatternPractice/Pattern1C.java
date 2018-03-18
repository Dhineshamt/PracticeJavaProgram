package javaPatternPractice;

public class Pattern1C {

	public static void main(String[] args) {
		int i, j;
		for(i = 1; i<= 6; i++) {
			for(j=1;j<=i;j++) {
				if(i==6) {
					System.out.print("@");
					
				}
				if(j==1) {
					System.out.print("@");
				}
				else if(i==j) {
					System.out.print("@");
				}
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
