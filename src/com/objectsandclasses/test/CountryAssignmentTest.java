package com.objectsandclasses.test;

import static org.junit.Assert.*;

import org.junit.Test;
import com.objectsandclasses.*;



public class CountryAssignmentTest {

	@Test
	public void MaxPopulationTest() {

		CountryAssignment countries[]={
				new CountryAssignment("India",100000,500),
				new CountryAssignment("China",20000,800),
				new CountryAssignment("USA",5000,400),
				new CountryAssignment("UK",15000,1000)
		};
		int maxPopulation=0;
		
		for(int i=0;i<countries.length;i++){
			if(maxPopulation<countries[i].getPopulation()){
				maxPopulation=countries[i].getPopulation();
			}
			
		}
		
		assertEquals(100000, maxPopulation);
		
	}
	@Test
	public void MaxAreaText() {

		CountryAssignment countries[]={
				new CountryAssignment("India",100000,500),
				new CountryAssignment("China",20000,800),
				new CountryAssignment("USA",5000,400),
				new CountryAssignment("UK",15000,1000)
		};
		
		int maxArea=0;
		
		for(int i=0;i<countries.length;i++){
			if(maxArea<countries[i].getArea()){
				maxArea=countries[i].getArea();
			}
			
		}
	
		assertEquals(1000, maxArea);

	}
	@Test
	public void MaxPopulationDensityTest() {

		CountryAssignment countries[]={
				new CountryAssignment("India",100000,500),
				new CountryAssignment("China",20000,800),
				new CountryAssignment("USA",5000,400),
				new CountryAssignment("UK",15000,1000)
		};
		
		int maxPopulationDensity=0;
		
		for(int i=0;i<countries.length;i++){
			if(maxPopulationDensity<(countries[i].getPopulation()/countries[i].getArea())){
				maxPopulationDensity=countries[i].getPopulation()/countries[i].getArea();
			}
			
		}
	
		assertEquals(200, maxPopulationDensity);

	}
}
