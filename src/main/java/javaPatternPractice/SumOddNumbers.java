package javaPatternPractice;

/**
 * 
 * @author Dhinesh
 * Psuedo Code 
 * 1. Declare Variables: int i -> to initiate the loop, int n -> The number till which odd numbers should be added,
 * 						 int sum -> To perform addition of the numbers
 * 2. Loop execution: Initiate the loop -> i =1; run the loop till i LT n; increase two numbers on every execution -> i+=2
 *    for(i=1;i<n;i+=2)
 * 3. Operation inside loop 
 * 		add sum and i and store in sum. 
 * 			Loop 1: sum = 0, i = 1, sum = sum + i = 1; 
 * 			Loop 2: sum = 1, i = 3, sum = sum + i = 4 
 * 4. Close the loop
 * 5. Print sum
 */	

public class SumOddNumbers {

	public static void main(String[] args) {
		int i, n = 10, sum = 0;
		for(i = 1; i<= n;i+=2) {
			sum = sum + i;
		}
		
		System.out.println(sum);

	}

}
