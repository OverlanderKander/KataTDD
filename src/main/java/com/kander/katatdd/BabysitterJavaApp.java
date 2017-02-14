package com.kander.katatdd;

import java.time.LocalTime;
import java.util.Scanner;

public class BabysitterJavaApp {

	public static void main(String[] args) {

		int start;
		int end;
		int bed;

		LocalTime jobStart;
		LocalTime jobEnd;
		LocalTime jobBed;

		BabysitterPayment paymentCalculator = new BabysitterPayment();

		Scanner scan = new Scanner(System.in);

		System.out.print("What time will the babysitting start?: ");
		jobStart = LocalTime.parse(scan.next());
		System.out.print("What time will the babysitting end?: ");
		jobEnd = LocalTime.parse(scan.next());
		System.out.print("What time will the kids go to bed?: ");
		jobBed = LocalTime.parse(scan.next());
		System.out.println("start time: " + jobStart + ", end time: " + jobEnd + ", bedtime: " + jobBed);
		start = jobStart.getHour();
		end = jobEnd.getHour();
		bed = jobBed.getHour();
		System.out.println("Total payment for this job: $" + paymentCalculator.babysittingTotalPay(start, end, bed) + ".00");

		scan.close();
	}
}
