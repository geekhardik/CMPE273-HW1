package edu.sjsu.cmpe273.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenericsTest {

	@Test
	public void test1() {
		Integer[] IntArr = { 1, 2, 3, 4, 5 };
		Integer[] Res = { 1, 2, 3, 4, 5 };
		assertArrayEquals(Res, IntArr);
	}

	@Test
	public void test2() {
		String[] StrArr = { "This is string array!" };
		String[] Res = { "This is string array!" };
		assertArrayEquals(StrArr, Res);
	}

	@Test
	public void test3() {
		Double[] DoubleArr = { 55.0, 4.67, 3.32, 7.54 };
		Double[] Res = { 55.0, 4.67, 3.32, 7.54 };
		assertArrayEquals(DoubleArr, Res);
	}

}
