package Babysitter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabysitterTest {

	@Test
	public void startAt5pmEndAt6pmReturns16() {
		BabysitterPayment payment = new BabysitterPayment();
		assertEquals("This test FAILS", 16, payment.babysittingTotalPay(17, 18, 20));
	}

}
