package com.objectsandclasses;

public class EmployeeAssignment {
	private int id;
	private String Name;
	private double monthlyBasic;
	double medical= 1250;
	double conveyance = 800;
	private static double PFrate =10;

	public EmployeeAssignment(int id,String Name,double monthlyBasic) {
		this.id=id;
		this.Name = Name;
		this.monthlyBasic=monthlyBasic;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}
	
	public double getMonthlyBasic() {
		return monthlyBasic;
	}

	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	
	public double hra() {
		return (float)(0.5*this.monthlyBasic);
	}
	
	public double calculatePf() {
		if((this.monthlyBasic*0.1)<6500) {
			return (float)(this.monthlyBasic*0.1);
		}
		else {
			return 6500;
		}
	}
	
	public double calculateEsic() {
		if(this.monthlyBasic<=5000) {
			return (float) (0.0475*monthlyBasic);
		}
		else {
			return 0;
		}
	}
	public double getAnnualBasic(double monthlyBasic) {
		return (12*this.monthlyBasic);
	}

	public double getMonthlyGrossSalary() {
	
		return (this.monthlyBasic + this.hra() + this.medical + this.conveyance);
	}
	
	public double getAnnualGrossSalary() {
		double r=12*this.getMonthlyGrossSalary();
		return r;
	
	}
	
	public double getMonthlyDeductions() {
		return (this.calculatePf()+this.calculateEsic()+this.hra());
	}
 
	public double getMonthlyTakeHome() {
		return (this.getMonthlyGrossSalary()-this.getMonthlyDeductions());
	}
	
	public double getAnnualTakeHome() {
		return (12*getMonthlyTakeHome());
	}
}


