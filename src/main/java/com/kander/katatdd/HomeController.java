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

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, HttpServletRequest request) {
		
		ArrayList<LocalTime> arrayListOfTimes = new ArrayList<LocalTime>();
		DateTimeFormatter formatHourMinuteAmPm = DateTimeFormatter.ofPattern("hh:mm a");
		LocalTime lt = LocalTime.of(17, 00);
		lt.format(formatHourMinuteAmPm);
		for (int i = 1; i <= 12; i++) {
			arrayListOfTimes.add(lt);
			lt = lt.plusHours(1);

			// ArrayList<LocalTime> arrayListOfTimes = new
			// ArrayList<LocalTime>();
			// LocalTime lt = LocalTime.of(17, 00);
			// for (int i = 1; i <= 12; i++) {
			// arrayListOfTimes.add(lt);
			// lt = lt.plusHours(1);
			// }

		}
		model.addAttribute("possibleTimes", arrayListOfTimes);

		return "home";
	}

}