package com.objectsandclasses;

public class CountryAssignment {

	private String country;
	private int population;
	private int area;
	
	public CountryAssignment(String country, int population, int area) {
		this.country = country;
		this.population = population;
		this.area = area;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

}

