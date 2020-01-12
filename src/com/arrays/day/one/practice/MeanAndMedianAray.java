package com.arrays.day.one.practice;

import java.util.Arrays;

public class MeanAndMedianAray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 19, 28, 5 };
		int mean = 0;
		int median = 0;
		for (int i = 0; i < array.length; i++) {
			mean += array[i];
		}
		System.out.println(mean / array.length);
		Arrays.sort(array);
		median = array[array.length / 2];
		System.out.println(median);
	}
}
