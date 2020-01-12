package com.arrays.day.one.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumSwaps {

	/**
	 * i arr swap (indices) 0 [7, 1, 3, 2, 4, 5, 6] swap (0,3) 1 [2, 1, 3, 7, 4, 5,
	 * 6] swap (0,1) 2 [1, 2, 3, 7, 4, 5, 6] swap (3,4) 3 [1, 2, 3, 4, 7, 5, 6] swap
	 * (4,5) 4 [1, 2, 3, 4, 5, 7, 6] swap (5,6) 5 [1, 2, 3, 4, 5, 6, 7]
	 * 
	 * 
	 * 
	 * This Minimum swap function will take array as an input
	 * the process starts by taking a boolean array of size of the array with all false;
	 * taking a map will make the process easy the map has key of ints and values as ints
	 * the keys will be the index of the numbers and the values will be the values at the arrays
	 * 
	 * iterating the map we will check if the position is already visited
	 * if not mark as visited  and 
	 * if the key is equal to the value then continue
	 * if not take the value into constant and find the value at that constant
	 * while if that value at that constant key is not visited make that isvisited true at that constant position
	 * now the nextnode will be element at key constant
	 * and c will be the nextnode
	 * repeat the process until the condition c is in its position
	 */

	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] arr) {
		boolean[] isVisited = new boolean[arr.length + 1];
		int minimumSwaps = 0;
		Map<Integer, Integer> elementMap = new HashMap<Integer, Integer>();
		for (int i = 1; i < isVisited.length; i++) {
			elementMap.put(i, arr[i-1]);
		}
		for (int position = 1; position < elementMap.size(); position++) {
			int nextNode;
			if (isVisited[position] == false) {
				isVisited[position] = true;
				if (position == elementMap.get(position)) {
					continue;
				} else {
					int c = elementMap.get(position);
					while (!isVisited[c]) {
						isVisited[c] = true;
						nextNode = elementMap.get(c);
						c = nextNode;
						++minimumSwaps;
					}
				}
			}

		}
		return minimumSwaps;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
			System.out.println(arr[i]);
		}

		int res = minimumSwaps(arr);

		scanner.close();
	}
}
