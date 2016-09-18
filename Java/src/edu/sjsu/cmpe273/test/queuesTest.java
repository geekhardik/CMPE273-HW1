package edu.sjsu.cmpe273.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.sjsu.cmpe273.array;
import edu.sjsu.cmpe273.queues;

public class queuesTest {

	queues obj = new queues();

	@Test
	public void test1() {

		String res = "1 10 11 ";
		assertEquals(res, obj.GetBinaryNumbers(3));
	}

	@Test
	public void test2() {
		String res = "1 10 11 100 101 ";
		assertEquals(res, obj.GetBinaryNumbers(5));
	}
	
	@Test
	public void test3() {
		String res = "1 10 11 100 101 110 111 1000 1001 1010 ";
		assertEquals(res, obj.GetBinaryNumbers(10));
	}

}
