package com.objectsandclasses;

public class RectangleShape {

	private double Length;
	private double Breadth;

	public RectangleShape() {                  
     
	}
    
	public RectangleShape(double Length,double Breadth) {
		this.Length=Length;
		this.Breadth=Breadth;
		
	}
   
	
	public void setWidth(double breadth) {
		Breadth = breadth;
	}

	public void setLength(double length) {
		Length = length;
	}

	public double getLength() {
		return Length;
	}
	

	public double getBreadth() {
		return Breadth;
	}

	

	
	public double AreaOfRectangle(){
		if(getLength()>=0 && getBreadth() >=0)
			return getLength()*getBreadth();
		else
			return 0;
	}
	
	public boolean isAreaOfRectangleSame (RectangleShape rectangle1 ,RectangleShape rectangle2) {
		return 	rectangle1.AreaOfRectangle()==rectangle2.AreaOfRectangle();
	}
}
