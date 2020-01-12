package com.arrays.day.one.practice;

import java.util.HashMap;
import java.util.Map;

/***
 * 
 * 
 * 
 * You are given an array arr[] of size N. You are also given two elements x and
 * y. Now, you need to tell which element (x or y) appears most in the array. In
 * other words, return the element, x or y, that has higher frequency in the
 * array. If both elements have the same frequency, then just return the smaller
 * element.
 */
public class WhoHasTheMajority {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (map.containsKey(arr[i])) {
				int value = map.get(arr[i]);
				map.put(arr[i], value + 1);
			} else {
				map.put(arr[i], count);
			}
		}
		// return the element if its count is more than n/2
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > arr.length / 2) {
				System.out.println(entry.getKey());
			}
		}

		System.out.println(map);
	}

}
