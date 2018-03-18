package javaPatternPractice;

public class Pattern1B {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=6;i++) {
			for(j=1;j<=6-i;j++) {
				System.out.print(j+ " ");
			}
			
			for(k=1;k<=i;k++) {
				System.out.print("& ");
			}
			System.out.println(" ");
		}
	}

}
