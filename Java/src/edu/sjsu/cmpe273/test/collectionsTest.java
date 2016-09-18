package edu.sjsu.cmpe273.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.sjsu.cmpe273.collections;

public class collectionsTest {
	collections obj = new collections();

	@Test
	public void test1() {
		System.out.println("test1");
		assertTrue(obj.checklinkedlist(21));
	}

	@Test
	public void test2() {
		System.out.println("test-2");
		assertFalse(obj.checklinkedlist("hardik"));
	}

	@Test
	public void test3() {
		System.out.println("test-3");
		assertTrue(obj.checklinkedlist(1));
	}
}
