package practiceJavaProgram;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LearningThrowConcept {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		System.out.println();
		int j = input.nextInt();
			try {
				if(i+j == 2){
				throw new FileNotFoundException();
				}
				
				else System.out.println(i+j);
			} catch (FileNotFoundException e) {
				// TODO Auto-generatsed catch block
				e.printStackTrace();
			}
		}

	}
