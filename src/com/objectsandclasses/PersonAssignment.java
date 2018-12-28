package com.objectsandclasses;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.util.Locale;
public class PersonAssignment{

	private String name; 
	private String dob;
	public PersonAssignment(String n, int d, int m, int y) 
	{
		this.name=n;
		this.dob=d+"/"+m+"/"+y;	 
	}
	public PersonAssignment() {
		
	}
	public void display()
	{
		System.out.println("Name : "+name+"\n"
						 + "Date Of Birth : "+dob+"\n"
						 + "Age : "+getAge(dob).getYears()+" Years, "+getAge(dob).getMonths()+" Months,"+ getAge(dob).getDays() +" Days\n");
		
	}
	public void olderOne(PersonAssignment p1,PersonAssignment p2) 
	{
		java.util.Date utilDateP1 = null;
		java.util.Date utilDateP2 = null;
		
		try {
			utilDateP1 = new SimpleDateFormat("dd/MM/yyyy").parse(p1.dob);
			utilDateP2 = new SimpleDateFormat("dd/MM/yyyy").parse(p2.dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		java.sql.Date sqlDateP1 = new java.sql.Date(utilDateP1.getTime());
		java.sql.Date sqlDateP2 = new java.sql.Date(utilDateP2.getTime());
		
		LocalDate p1date = new java.sql.Date(sqlDateP1.getTime()).toLocalDate();
		LocalDate p2Date = new java.sql.Date(sqlDateP2.getTime()).toLocalDate();
		Period period = Period.between(p2Date, p1date);


		if(period.getYears()<0){
			System.out.println(p1.name+" is older than "+p2.name+" by "+Math.abs(period.getYears()) +" Years, " +Math.abs(period.getMonths())+ " Months, " +Math.abs(period.getDays())+ " Days");
		
		}else{

			System.out.println(p2.name+" is older than "+p1.name+" by "+Math.abs(period.getYears()) +" Years, " +Math.abs(period.getMonths())+ " Months, " +Math.abs(period.getDays())+ " Days");
		}
	}

	public Period getAge(String dob){
		java.util.Date utilDate = null;
		
		try {
			utilDate = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		
		LocalDate today = LocalDate.now();
		LocalDate birthday = new java.sql.Date(sqlDate.getTime()).toLocalDate();
		Period period = Period.between(birthday, today);

		return period;
	}
	
}
