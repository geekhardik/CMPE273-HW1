package edu.sjsu.cmpe273.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.sjsu.cmpe273.array;
import edu.sjsu.cmpe273.stackproblem;

public class arrayTest {

	@Test
	public void test1() {
		int[] a = { 1, 2, 3, 4, 5 };
		array obj = new array();
		int[] res = { 5, 4, 3, 2, 1 };
		assertArrayEquals(res, obj.max_sort(a));
	}

	@Test
	public void test2() {
		int[] a = { 10, 2, 300, 43, 5000 };
		array obj = new array();
		int[] res = { 5000, 300, 43, 10, 2 };
		assertArrayEquals(res, obj.max_sort(a));
	}

}
