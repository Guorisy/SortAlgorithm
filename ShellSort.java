package com.queue;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int[] arr = {-5,5,7,8,1,2,5};
		int[] arr1 = shellSort(arr);
		System.out.println(Arrays.toString(arr1));//[-5, 1, 2, 5, 5, 7, 8]
	}
	/**
     * Ï£¶ûÅÅĞò
     *
     * @param array
     * @return
     */
    public static int[] shellSort(int[] array) {
        int len = array.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        return array;
    }
}
