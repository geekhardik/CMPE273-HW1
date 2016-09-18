package edu.sjsu.cmpe273.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.sjsu.cmpe273.Interface;
import edu.sjsu.cmpe273.array;

public class InterfaceTest {

	Interface i = new Interface();

	@Test
	public void test1() {
		String[] s = i.diciplines();
		String[] res = { "Computer Engg", "Software Engg", "Electrical Engg", "Mechanical Engg" };
		assertArrayEquals(res, s);
	}

	@Test
	public void test2() {
		int subj = i.subjects();
		int res = 14;
		assertEquals(res, subj);
	}

	@Test
	public void test3() {
		String[] B = i.Building();
		String[] res = { "Engg", "Science", "Music" };
		assertArrayEquals(res, B);
	}
}
