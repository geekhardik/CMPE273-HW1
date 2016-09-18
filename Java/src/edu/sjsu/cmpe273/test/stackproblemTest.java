package edu.sjsu.cmpe273.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.sjsu.cmpe273.stackproblem;

public class stackproblemTest {

	@Test	
	public void test1() {
		String s = "wow";
		stackproblem obj = new stackproblem();
		assertTrue(obj.palindorme(s));
	}
	
	@Test	
	public void test2() {
		String s = "woww";
		stackproblem obj = new stackproblem();
		assertEquals(false, obj.palindorme(s));
	}

}
