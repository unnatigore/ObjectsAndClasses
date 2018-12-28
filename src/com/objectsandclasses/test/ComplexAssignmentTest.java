package com.objectsandclasses.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.objectsandclasses.ComplexAssignment;
public class ComplexAssignmentTest {

	ComplexAssignment checkComplex1;
	ComplexAssignment checkComplex2;
	ComplexAssignment checkComplex3;
	
	@Before
	public void setUp()  {
	
	checkComplex1 = new ComplexAssignment();
	checkComplex2 = new ComplexAssignment();
	checkComplex3 = new ComplexAssignment();
	
	}
	@Test
	public void test1() {
		checkComplex1.set(20,25);
		checkComplex1.Display();
		checkComplex2.set(36, 54);
		checkComplex2.Display();
		checkComplex3=checkComplex3.sum(checkComplex1,checkComplex2);
		assertEquals(56,checkComplex3.getReal(),0);

	}
	@Test
	public void test2() {
		checkComplex1.set(20,25);
		checkComplex2.set(36, 54);
		checkComplex3=checkComplex3.sum(checkComplex1,checkComplex2);
		assertEquals(79,checkComplex3.getImaginary(),0);
		checkComplex3.Display();
	}
}

