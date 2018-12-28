package com.objectsandclasses.test;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import com.objectsandclasses.TelevisionAssignment;


public class TelevisionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		TelevisionAssignment sony=new TelevisionAssignment();
		sony.changeChannel(TelevisionAssignment.INCREASE);
		System.out.println();
	}

}