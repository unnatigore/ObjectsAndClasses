package com.objectsandclasses;
public class DistanceAssignment{

	public int feet;
	public float inches;

	public DistanceAssignment(int feet, float inches) {
	
		this.feet=feet;
		this.inches=inches;
		
	}
	public DistanceAssignment() {
	
	}

	public void set(int feet,float inches){
		this.feet=feet;
		this.inches=inches;
	}
	
	public void display(){
		System.out.println("Distance is : "+feet+" feet " +inches+" inches");
	}
	
	public DistanceAssignment add(DistanceAssignment d1,DistanceAssignment d2) {
		DistanceAssignment d=new DistanceAssignment();
		d.feet=d1.feet+d2.feet;
		d.inches=d1.inches+d2.inches;
		return d;
	}

}
