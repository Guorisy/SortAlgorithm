package com.queue;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int[] arr = {-5,5,7,8,1,2,5};
		int[] arr1 = insertSort(arr);
		System.out.println(Arrays.toString(arr1));//[-5, 1, 2, 5, 5, 7, 8]

	}
	/**
     * ²åÈëÅÅĞò
     * @param array
     * @return
     */
    public static int[] insertSort(int[] array) {
        if (array.length == 0)
            return array;
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        return array;
    }
}
