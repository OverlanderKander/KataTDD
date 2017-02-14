package com.kander.katatdd;

public class BabysitterPayment {

	int paymentAmount = 0;
	int rate1 = 12;
	int rate2 = 8;
	int rate3 = 16;

	public int babysittingTotalPay(int startTime, int endTime, int bedtime) {

		if (endTime <= 4) {
			endTime += 24;
		}

		if (bedtime <= 4) {
			bedtime += 24;
		}

		if (bedtime > endTime) {
			paymentAmount += (24 - startTime) * rate1;
			paymentAmount += (endTime - 24) * rate1;

		} else if (endTime <= 24) {
			paymentAmount += (bedtime - startTime) * rate1;
			paymentAmount += (endTime - bedtime) * rate2;

		} else if (bedtime >= 24) {
			paymentAmount += (24 - startTime) * rate1;
			paymentAmount += (endTime - 24) * rate3;
		}

		else {
			paymentAmount += (bedtime - startTime) * rate1;
			paymentAmount += (24 - bedtime) * rate2;
			paymentAmount += (endTime - 24) * rate3;
		}

		return paymentAmount;
	}
}
