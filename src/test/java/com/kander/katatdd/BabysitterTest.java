package com.kander.katatdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabysitterTest {
	BabysitterPayment payment = new BabysitterPayment();

	@Test
	public void startAt5pmEndAt6pmReturns12() {
		assertEquals("This test FAILS", 12, payment.babysittingTotalPay(17, 18, 20));
	}
	
	@Test
	public void startAt5pmEndAt7pmReturns24() {
		assertEquals("This test FAILS", 24, payment.babysittingTotalPay(17, 19, 20));
	}
	
	@Test
	public void startAt5pmEndAt8pmReturns36() {
		assertEquals("This test FAILS", 36, payment.babysittingTotalPay(17, 20, 20));
	}
	
	@Test
	public void startAt5pmBedtimeAt8pmEndAt11pmReturns60() {
		assertEquals("This test FAILS", 60, payment.babysittingTotalPay(17, 23, 20));
	}
	
	@Test
	public void startAt5pmBedtimeAt8pmEndAt4amReturns132() {
		assertEquals("This test FAILS", 132, payment.babysittingTotalPay(17, 4, 20));
	}
	
	@Test
	public void startAt8pmBedtimeAt10pmEndAt2amReturns72() {
		assertEquals("This test FAILS", 72, payment.babysittingTotalPay(20, 2, 22));
	}
	
	@Test
	public void ifBedtimeIsAfterMidnightSkipRate2StartAt9pmBedAt2amEndAt3amReturn84() {
		assertEquals("This test FAILS", 84, payment.babysittingTotalPay(21, 3, 2));
	}
	
	@Test
	public void bedtimeAfterMidnightTest2StartAt5pmBedAt1amEndAt4amReturn148() {
		assertEquals("This test FAILS", 148, payment.babysittingTotalPay(17, 4, 1));
	}
	
	@Test
	public void bedtimeAtMidnightStartAt8pmBedAt12amEndAt4amReturn112() {
		assertEquals("This test FAILS", 112, payment.babysittingTotalPay(20, 4, 0));
	}

}
