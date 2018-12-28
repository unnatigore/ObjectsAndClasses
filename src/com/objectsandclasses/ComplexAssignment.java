package com.objectsandclasses;

public class ComplexAssignment {
	public float Real;
	public float Imaginary;

	public void set(float Real,float Imaginary) {
		this.Real=Real;
		this.Imaginary=Imaginary;
	
	}
	public void Display() {
		System.out.println("Complex Number is   "+Real+" + "+Imaginary+" i");
	
	}
	
	public float getReal() {
		return Real;
	}
	
	public void setReal(float real) {
		Real = real;
	}
	
	public float getImaginary() {
		return Imaginary;
	}
	
	public void setImaginary(float imaginary) {
		Imaginary = imaginary;
	}

	public ComplexAssignment sum(ComplexAssignment number1,ComplexAssignment number2){
	
		ComplexAssignment complex=new ComplexAssignment();
		complex.Real=number1.Real+number2.Real;
		complex.Imaginary=number1.Imaginary+number2.Imaginary;
		return complex;
	
	}

}


