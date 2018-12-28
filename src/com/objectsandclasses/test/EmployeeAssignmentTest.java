package com.objectsandclasses.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.objectsandclasses.EmployeeAssignment;


public class EmployeeAssignmentTest {
	
	EmployeeAssignment Employee;
	
	@Before
	public void setUp() throws Exception {
		Employee =new EmployeeAssignment(1,"Unnati Gore",10000);
		Employee.setMonthlyBasic(10000);
		
	}
	
	@Test
	public void AnnualBasicTest() {
		double actual = Employee.getAnnualBasic(10000);
		assertEquals(120000, actual,0);
	}
	
	@Test
	public void MonthlyGrossSalaryTest() {
		Employee.hra();
		double actual=Employee.getMonthlyGrossSalary();
		assertEquals(17050, actual,0);
	}

	@Test
	public void AnnualGrossSalaryTest() {
		double actual=Employee.getAnnualGrossSalary();
		assertEquals(204600, actual,0);
	}
	
	@Test
	public void MonthlyDeductionsTest() {
		double actual=Employee.getMonthlyDeductions();
		assertEquals(6000, actual,0);
	}
	
	@Test
	public void MonthlyTakeHomeTest() {
		double actual=Employee.getMonthlyTakeHome();
		assertEquals(11050, actual,0);
	}
	
	@Test
	public void AnnualTakeHomeTest() {
		double actual=Employee.getAnnualTakeHome();
		assertEquals(132600, actual,0);
	}
	
}
