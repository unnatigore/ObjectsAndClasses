package com.objectsandclasses;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class DateAssignment {

	private int d, m, y; 
	public DateAssignment(int d, int m, int y) 
	{
		this.d=d;
		this.m=m;
		this.y=y;
		 
	}
	public DateAssignment() {
		
	}
	public String toString()
	{
		
		
		return d+"/"+m+"/"+y;
	}
	public boolean isSmaller(DateAssignment d)
	{
		
		java.util.Date utilDateD1 = null;
		java.util.Date utilDateD2 = null;
		
		try {
			utilDateD1 = new SimpleDateFormat("dd/MM/yyyy").parse(d+"/"+m+"/"+y);
			utilDateD2 = new SimpleDateFormat("dd/MM/yyyy").parse(d.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		java.sql.Date sqlDateD1 = new java.sql.Date(utilDateD1.getTime());
		java.sql.Date sqlDateD2 = new java.sql.Date(utilDateD2.getTime());
		
		LocalDate d1date = new java.sql.Date(sqlDateD1.getTime()).toLocalDate();
		LocalDate d2Date = new java.sql.Date(sqlDateD2.getTime()).toLocalDate();
		Period period = Period.between(d2Date, d1date);

		if(period.getYears()<=0 || period.getMonths()<=0 || period.getDays()<=0){
			return true;
		}else{
			return false;
		}
	}
	public int[] diff(DateAssignment d1,DateAssignment d2) 
	{
		

		java.util.Date utilDateD1 = null;
		java.util.Date utilDateD2 = null;
		
		try {
			utilDateD1 = new SimpleDateFormat("dd/MM/yyyy").parse(d1.toString());
			utilDateD2 = new SimpleDateFormat("dd/MM/yyyy").parse(d2.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		java.sql.Date sqlDateD1 = new java.sql.Date(utilDateD1.getTime());
		java.sql.Date sqlDateD2 = new java.sql.Date(utilDateD2.getTime());
		
		LocalDate d1date = new java.sql.Date(sqlDateD1.getTime()).toLocalDate();
		LocalDate d2Date = new java.sql.Date(sqlDateD2.getTime()).toLocalDate();
		Period period = Period.between(d2Date, d1date);

		int dates[]=new int[3];
		dates[0]=Math.abs(period.getDays());
		dates[1]=Math.abs(period.getMonths());
		dates[2]=Math.abs(period.getYears());
		return dates;
	}
	
}