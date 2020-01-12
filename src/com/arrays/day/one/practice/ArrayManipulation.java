package com.arrays.day.one.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayManipulation {

	// Complete the arrayManipulation function below.
	static long arrayManipulation(int numberOfElements, int[][] queries) {

		int insertValue = 0;
		int[] array = new int[numberOfElements];
		for (int i = 0; i < queries.length; i++) {
			int startPoint = queries[i][0];
			int endPoint = queries[i][1];
			insertValue = queries[i][2];
			System.out.println();
			for (int element = 1; element < array.length; element++) {
				if (element >= startPoint && element <= endPoint) {
					if (array[element] != 0) {
						array[element] += insertValue;
					} else {
						array[element] = insertValue;
					}
				}
			}
		}
		Arrays.sort(array);
		return array[array.length - 1];

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nm = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nm[0]);

		int m = Integer.parseInt(nm[1]);

		int[][] queries = new int[m][3];

		for (int i = 0; i < m; i++) {
			String[] queriesRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 3; j++) {
				int queriesItem = Integer.parseInt(queriesRowItems[j]);
				queries[i][j] = queriesItem;
			}
		}

		long result = arrayManipulation(n, queries);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
