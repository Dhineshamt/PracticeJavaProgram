package javaPatternPractice;

public class Problem7 {

	public static void main(String[] args) {
		int printDollar = 0, totalDollar = 20, spaceToPrintOneSide = 0, dollarsToPrint=0;
		
		for(int i=1;i<=10;i++ ){
			dollarsToPrint = printDollar + 2;
			spaceToPrintOneSide = (totalDollar-dollarsToPrint)/2;
			for(int j=1;j<=spaceToPrintOneSide;j++){
				System.out.print(" ");
			}
			
			for(int k=1; k <= dollarsToPrint;k++)
			{
				System.out.print("$");
			}
			for(int j=1;j<=spaceToPrintOneSide;j++){
				System.out.print(" ");
			}
			System.out.println();
			printDollar+=2;
		}
		
		

	}

}
