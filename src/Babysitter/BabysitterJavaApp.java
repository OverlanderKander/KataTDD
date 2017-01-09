package Babysitter;

import java.util.Scanner;

public class BabysitterJavaApp {

	public static void main(String[] args) {
		int start;
		int end;
		int bed;
		BabysitterPayment paymentCalculator = new BabysitterPayment();

		Scanner scan = new Scanner(System.in);

		System.out.print("What time will the babysitting start?: ");
		start = scan.nextInt();
		System.out.print("What time will the babysitting end?: ");
		end = scan.nextInt();
		System.out.print("What time will the kids go to bed?: ");
		bed = scan.nextInt();
		
		System.out.println("Total payment for this job: $" + paymentCalculator.babysittingTotalPay(start, end, bed) + ".00");

		scan.close();
	}

}
