package algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		int sortArray[] = { 10, 11, 14, 5, 12, 1, 2, 3, 39, 1 };
		boolean swap = true;
		int helper;
		while (swap == true) {
			swap = false;
			for (int i = 0, j = i + 1; j < sortArray.length; i++, j++) {
				if (sortArray[j] < sortArray[i]) {
					helper = sortArray[i];
					sortArray[i] = sortArray[j];
					sortArray[j] = helper;
					swap = true;
				}
			}
		}

		for (int number : sortArray) {
			System.out.print(number + " ");
		}
	}
}