package com.objectsandclasses;
public class TriangleAssignment { 
double side1,side2,side3; 

	public TriangleAssignment(double side1,double side2,double side3) { 
		this.side1=side1; 
		this.side2=side2; 
		this.side3=side3; 
	} 

	public boolean isRight() { 

		double h = Math.sqrt (Math.pow(side2,2)+ Math.pow(side3,2)); 
		if(h==side1) 
			return true; 


		h = Math.sqrt (Math.pow(side1,2)+ Math.pow(side3,2)); 
		if(h==side2) 
			return true; 


		h = Math.sqrt (Math.pow(side1,2)+ Math.pow(side2,2)); 
		if(h==side3) 
			return true; 
		else
			return false; 
	} 

	public boolean isScalene() {
		if(side1==side2 || side1==side3 || side2==side3) 
			return false; 
		else 
			return true; 
	} 

	public boolean isIsosceles() { 
		return !(isScalene()); 
	} 

	public boolean isEquilateral() { 
		return (side1==side2) && (side2==side3); 
	} 

} 


