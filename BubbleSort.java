package com.queue;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {-5,5,7,8,1,2,5};
		int[] arr1 = bubbleSort(arr);
		System.out.println(Arrays.toString(arr1));//[-5, 1, 2, 5, 5, 7, 8]
	}

	/**
	 * ц╟ещеепР
	 *
	 * @param array
	 * @return
	 */
	public static int[] bubbleSort(int[] array) {
		if (array.length == 0)
			return array;
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array.length - 1 - i; j++)
				if (array[j + 1] < array[j]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
		return array;
	}
}
