package sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] result = insertionSort(new int[] { 25, 17, 31, 13, 2 });

		System.err.println(Arrays.toString(result));

	}

	private static int[] insertionSort(int[] input) {
		for (int i = 0; i < input.length; i++) {
			int temp = input[i];
			int j = i;

			while (j > 0 && temp < input[j - 1]) {
				input[j] = input[j - 1];
				j = j - 1;
			}

			input[j] = temp;

		}
		return input;
	}

}
