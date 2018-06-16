package practiceJavaProgram;
import java.util.Scanner;

public class ReverseTheNumber {
	
	static int numberToReverse;
	public int reverseTheNumber(int numberToReverse) {
		int reverseNumber = 0;
		while(numberToReverse != 0) {
			reverseNumber = (reverseNumber * 10) + (numberToReverse%10);
			numberToReverse = numberToReverse / 10;
		}
		return reverseNumber;
	}
	
	
	public static void main(String args[]) {
		System.out.println("Please input number to reverse");
		Scanner getInput = new Scanner(System.in);
		int numberToReverse = getInput.nextInt();
		
		ReverseTheNumber helpToReverNumber = new ReverseTheNumber();
		int reversedNumber = helpToReverNumber.reverseTheNumber(numberToReverse);
		System.out.println(reversedNumber);
	}

}
