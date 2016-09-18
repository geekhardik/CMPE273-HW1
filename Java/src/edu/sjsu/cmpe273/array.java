//Reverse an Array!

package edu.sjsu.cmpe273;

import java.util.Arrays;

public class array {

	public int[] max_sort(int[] a) {
		int[] max = new int[a.length];

		Arrays.sort(a);

		for (int i = 0, j = a.length - 1; i < max.length; i++, j--) {
			max[i] = a[j];
		}

		for (int x : max) {
			System.out.print(x + " ");
		}

		return max;

	}

	public static void main(String[] args) {

		array arr = new array();
		int[] a = { 1, 2, 3, 4 };
		int[] res = new int[a.length];
		res = arr.max_sort(a);

	}
}
