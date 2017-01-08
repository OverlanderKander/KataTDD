package Babysitter;

public class BabysitterPayment {

	int paymentAmount = 0;

	public int babysittingTotalPay(int startTime, int endTime, int bedtime) {

		if (bedtime > endTime) {
			paymentAmount += (endTime - startTime) * 12;
		} else {
			paymentAmount += (bedtime - startTime) * 12;
			paymentAmount += (endTime - bedtime) * 8;
		}
		return paymentAmount;
	}
}
