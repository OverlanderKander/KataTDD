package Babysitter;

public class BabysitterPayment {

	int paymentAmount = 0;

	public int babysittingTotalPay(int startTime, int endTime, int bedtime) {

		if (endTime <= 4) {
			endTime += 24;
		}
			
		if (bedtime > endTime) {
			paymentAmount += (endTime - startTime) * 12;

		} else if (endTime <= 23) {
			paymentAmount += (bedtime - startTime) * 12;
			paymentAmount += (endTime - bedtime) * 8;

		} else {
			paymentAmount += (bedtime - startTime) * 12;
			paymentAmount += (24 - bedtime) * 8;  
			paymentAmount += (endTime - 24) * 16; 
		}

		return paymentAmount;
	}
}
