package com.kander.katatdd;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

	DateTimeFormatter formatAmPm = DateTimeFormatter.ofPattern("h:mm a");
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, HttpServletRequest request) {
		
		ArrayList<String> arrayListOfTimes = new ArrayList<String>();
		LocalTime lt = LocalTime.of(17, 00);
	
		for (int i = 1; i <= 12; i++) {
			arrayListOfTimes.add(lt.format(formatAmPm));
			lt = lt.plusHours(1);
		}
		model.addAttribute("possibleTimes", arrayListOfTimes);

		return "home";
	}
	
	@RequestMapping(value = "/showMeTheMoney", method = RequestMethod.POST)
	public String showMeTheMoney(Model model, HttpServletRequest request) {
		LocalTime startTimeSelected = LocalTime.parse(request.getParameter("startTime"), formatAmPm);
		LocalTime endTimeSelected = LocalTime.parse(request.getParameter("endTime"), formatAmPm);
		LocalTime bedTimeSelected = LocalTime.parse(request.getParameter("bedtime"), formatAmPm);

		int start = startTimeSelected.getHour();
		int end = endTimeSelected.getHour();
		int bed = bedTimeSelected.getHour();
		
		BabysitterPayment paymentCalculator = new BabysitterPayment();
		String jobDetails = "Start time: " + request.getParameter("startTime") + ". End time: " + request.getParameter("endTime") + ". Bedtime: " + request.getParameter("bedtime");
		String jobAmount = "Total payment for this job: $" + paymentCalculator.babysittingTotalPay(start, end, bed) + ".00";
		
		model.addAttribute("jobDetails", jobDetails);
		model.addAttribute("jobAmount", jobAmount);
		
		return "home";
	}

}