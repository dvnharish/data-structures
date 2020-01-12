package com.arrays.day.one.practice;

/**
 * 
 * Insertion is a basic but frequently used operation. Arrays in most languages
 * cannnot be dynamically shrinked or expanded. Here, we will work with such
 * arrays and try to insert an element at some index.
 * 
 * You are given an array arr. The size of the array is given by sizeOfArray.
 * You need to insert an element at given index and print the modified array.
 * 
 * Input Format: The first line of input contains T denoting the number of
 * testcases. T testcases follow. Each testcase contains three lines of input.
 * The first line contains size of the array denoted by sizeOfArray. The second
 * line contains sizeOfArray-1 elements separated by spaces. The third line
 * contains index and the element to be inserted separated by a space.
 * 
 * Output Format: For each testcase, in a new line, print the modified array.
 * 
 * Your Task: This is a function problem. The input is already taken care of by
 * the driver code. You only need to complete the function insertAtIndex() that
 * takes arr, sizeOfArray, index, element as input. The printing is done by
 * driver code.
 * 
 * Constraints: 1 <= T <= 100 1 <= sizeOfArray <= 1000 0 <= element, arri <= 106
 * 0 <= index <= sizeOfArray-1
 * 
 * Examples: Input: 2 6 1 2 3 4 5 5 90 6 1 2 3 4 5 2 90
 * 
 * Output: 1 2 3 4 5 90 1 2 90 3 4 5
 * 
 * Explanation: Testcase 1: 90 in inserted at index 5(0-based indexing). After
 * inserting, array elements are like 1, 2, 3, 4, 5, 90. Testcase 2: 90 in
 * inserted at index 2(0-based indexing). After inserting, array elements are
 * like 1, 2, 90, 3, 4, 5.
 * 
 * 
 * 1 3 4 5 2 2 1 2 3 4 5 iterate the arr and make that place empty and pust the
 * element in that array
 ***/
public class InsertAtIndex {

	public static void main(String[] args) {
		int[] initial = { 11, 12, 13, 14, 15 };

		int value = 50;
		int position = 2;
		int[] updated = new int[initial.length + 1];

		for (int i = 0, j = 0; i < initial.length; i++, j++) {
			if (i == position) {
				updated[j] = value;
				j++;
			}
			updated[j] = initial[i];
		}

	}

}
