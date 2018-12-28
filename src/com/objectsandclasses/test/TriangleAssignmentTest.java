package com.objectsandclasses.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.objectsandclasses.*;
public class TriangleAssignmentTest {
	@Before
	public void setUp() throws Exception {
	}
	
 	@Test
	public void test() { 
	TriangleAssignment t = new TriangleAssignment(3,4,5);
	
	boolean actual1 = t.isRight();
	assertEquals(true, actual1);
	boolean actual2 = t.isScalene();
	assertEquals(true, actual2);
	boolean actual3 = t.isIsosceles();
	assertEquals(false, actual3);
	boolean actual4 = t.isEquilateral();
	assertEquals(false, actual4);
	
	System.out.println("isRight: "+t.isRight()); 
	System.out.println("isScalene: "+t.isScalene()); 
	System.out.println("isIsosceles: "+t.isIsosceles()); 
	System.out.println("isEquilateral: "+t.isEquilateral()); 
	} 


}
