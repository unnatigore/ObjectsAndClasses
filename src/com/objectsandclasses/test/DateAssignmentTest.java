package com.objectsandclasses.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.objectsandclasses.*;

public class DateAssignmentTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		DateAssignment d1=new DateAssignment(10,12,2017);
		DateAssignment d2=new DateAssignment(10,12,2016);
		assertEquals(true, d2.isSmaller(d1));

	}

}
