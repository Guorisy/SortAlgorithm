package com.queue;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		int[] arr = {-5,5,7,8,1,2,5};
		int[] arr1 = selectSort(arr);
		System.out.println(Arrays.toString(arr1));//[-5, 1, 2, 5, 5, 7, 8]
	}
	
	/**
     * 选择排序
     * @param array
     * @return
     */
    public static int[] selectSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) //找到最小的数
                    minIndex = j; //将最小数的索引保存
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
