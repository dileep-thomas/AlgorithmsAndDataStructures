package sort;

import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args) {
		int[] result = findSelectionSort(new int[] { 5, 2, 6, 7, 2, 1, 0, 3});
		System.err.println(Arrays.toString(result));

	}

	private static int[] findSelectionSort(int[] input) {
		for (int i = 0; i < input.length; i++) {
			int minIndex = findMinIndex(input, i);
			if (input[i] > input[minIndex]) {
				int temp = input[i];
				input[i] = input[minIndex];
				input[minIndex] = temp;
			}

		}
		return input;
	}

	private static int findMinIndex(int[] input, int k) {
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		for (int i = k; i < input.length; i++) {
			if (input[i] < min) {
				min = input[i];
				minIndex = i;
			}

		}
		return minIndex;
	}

}
