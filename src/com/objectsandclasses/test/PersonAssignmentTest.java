package com.objectsandclasses.test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Test;

import com.objectsandclasses.*;
public class PersonAssignmentTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		PersonAssignment person1=new PersonAssignment("Unnati",5,6,1980);
		PersonAssignment person2=new PersonAssignment("Poonam",2,3,1987);
		person1.display();
		person2.display();
		PersonAssignment person3=new PersonAssignment();
		person3.olderOne(person1, person2);
	}
	public static void main(String args[]){
		PersonAssignment person1=new PersonAssignment("Unnati",5,6,1980);
		PersonAssignment person2=new PersonAssignment("Poonam",2,3,1987);
	}
	
}
