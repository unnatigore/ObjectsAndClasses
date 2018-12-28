package com.objectsandclasses.test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.objectsandclasses.TimeAndHour;
public class TimeAndHourTest {


	@Test
	public void test() {
		TimeAndHour t1=new TimeAndHour();
		t1.setTime(4, 10);
		TimeAndHour t2=new TimeAndHour();
		t2.setTime(5, 20);
		t1.display();
		t2.display();
		TimeAndHour t3=new TimeAndHour();
		
		
		assertEquals(9,t3.sum(t1, t2).getHours() );
		assertEquals(30,t3.sum(t1, t2).getMinutes());
	
												
		System.out.println("Addition of hours is "+t3.sum(t1, t2).getHours()+" hours, "+t3.sum(t1, t2).getMinutes()+" minutes");
		
		
	}

}