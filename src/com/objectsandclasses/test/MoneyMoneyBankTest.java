package com.objectsandclasses.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.objectsandclasses.*;
public class MoneyMoneyBankTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void DepositTest() {
		MoneyMoneyBank MMBank=new MoneyMoneyBank();
		double actual=MMBank.Deposite(60000, 2000);
		assertEquals(62000, actual,0);
		}
	
	public void WithdrawTest() {
		MoneyMoneyBank MMBank=new MoneyMoneyBank();
		double actual=MMBank.Deposite(60000, 2000);
		assertEquals(58000, actual,0);
		}
}


