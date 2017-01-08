package Babysitter;

public class BabysitterPayment {

	public int babysittingTotalPay(int startTime, int endTime, int bedtime) {
		return (endTime - startTime) * 16;
	}
}
