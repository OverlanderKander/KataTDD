package com.kander.katatdd;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	DateTimeFormatter formatAmPm = DateTimeFormatter.ofPattern("h:mm a");
	ListOfTimes times = new ListOfTimes();

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String home(Model model, HttpServletRequest request) {
		ArrayList<String> arrayListOfTimes = times.getTimesThroughEndOfArray(0);
		model.addAttribute("possibleTimes", arrayListOfTimes);

		String startTimeSelected = request.getParameter("startTime");
		String endTimeSelected = request.getParameter("endTime");
		String bedtimeSelected = request.getParameter("bedtime");

		if (bedtimeSelected != null) {
			System.out.println("the current bedtime is " + bedtimeSelected);
			int start = LocalTime.parse(startTimeSelected, formatAmPm).getHour();
			int end = LocalTime.parse(endTimeSelected, formatAmPm).getHour();
			int bed = LocalTime.parse(bedtimeSelected, formatAmPm).getHour();

			BabysitterPayment paymentCalculator = new BabysitterPayment();
			String jobDetails = "Start time: " + startTimeSelected + ". End time: " + endTimeSelected + ". Bedtime: "
					+ bedtimeSelected;
			String jobAmount = "Total payment for this job: $" + paymentCalculator.babysittingTotalPay(start, end, bed)
					+ ".00";

			model.addAttribute("jobDetails", jobDetails);
			model.addAttribute("jobAmount", jobAmount);
		}
		return "home";
	}
}