package com.objectsandclasses.test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.objectsandclasses.DistanceAssignment;

public class DistanceAssignmentTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		DistanceAssignment d1=new DistanceAssignment(1,1.2f);
		d1.display();
		DistanceAssignment d2=new DistanceAssignment(2,2.2f);
		d2.display();
		DistanceAssignment d3=new DistanceAssignment();
		System.out.println("Addition of Distance is : "+d3.add(d1, d2).feet+" feet " + d3.add(d1, d2).inches+" inches" );
		}
	}