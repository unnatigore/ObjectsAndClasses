package com.objectsandclasses.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.objectsandclasses.*;
public class RectangleTest {

	RectangleShape checkRectangleShape;
	@Test
	public void rectangleareatest() {
		RectangleShape rectangle=new RectangleShape(10, 5);
		double expected=50;
		double actual =rectangle.AreaOfRectangle();
		
		assertEquals(expected, actual,2);
	}

	@Test
	public void rectangleshapetest() {
		RectangleShape rectangle=new RectangleShape();
		
		boolean actual=rectangle.isAreaOfRectangleSame (new RectangleShape(25,5), new RectangleShape(5,25));

		assertEquals(true, actual);
		
		
}
}

