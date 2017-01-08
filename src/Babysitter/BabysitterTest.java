package Babysitter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabysitterTest {

	@Test
	public void startAt5pmEndAt6pmReturns16() {
		BabysitterPayment payment = new BabysitterPayment();
		assertEquals("This test FAILS", 16, payment.babysittingTotalPay(17, 18, 20));
	}
	
	@Test
	public void startAt5pmEndAt7pmReturns32() {
		BabysitterPayment payment = new BabysitterPayment();
		assertEquals("This test FAILS", 32, payment.babysittingTotalPay(17, 19, 20));
	}
	
	@Test
	public void startAt5pmEndAt8pmReturns48() {
		BabysitterPayment payment = new BabysitterPayment();
		assertEquals("This test FAILS", 48, payment.babysittingTotalPay(17, 20, 20));
	}
	
	@Test
	public void startAt5pmBedtimeAt8pmEndAt11pmReturns72() {
		BabysitterPayment payment = new BabysitterPayment();
		assertEquals("This test FAILS", 72, payment.babysittingTotalPay(17, 23, 20));
	}
}
