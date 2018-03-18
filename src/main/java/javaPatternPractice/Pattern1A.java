package javaPatternPractice;

/**
 * 
 * @author Dhinesh
 * Pattern 
 * 1*****
 * 12****
 * 123***
 * 1234**
 * 12345*
 * 123456
 *
 */

public class Pattern1A {

	public static void main(String[] args) {
		int i, j, k;
		for(i =1; i<= 6;i++) {
			
			for(j=1; j<=i;j++) {
				System.out.print(j+ " ");				
			}
			for(k=1;k<=6-i;k++) {
				System.out.print("* ");
			}			
			System.out.println();
		}

	}
}
