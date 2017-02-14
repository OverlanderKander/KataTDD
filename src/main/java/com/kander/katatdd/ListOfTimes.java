package com.kander.katatdd;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ListOfTimes {

	private DateTimeFormatter formatAmPm = DateTimeFormatter.ofPattern("h:mm a");
	private ArrayList<LocalTime> allTheTimes = new ArrayList<LocalTime>();

	public ListOfTimes() {
		LocalTime lt = LocalTime.of(17, 00);
		for (int i = 1; i <= 12; i++) {
			allTheTimes.add(lt);
			lt = lt.plusHours(1);
		}
	}
	
	public ArrayList<String> getAllTimes() {
		ArrayList<String> timesToReturn = new ArrayList<>();
		for (int i = 0; i < allTheTimes.size(); i++) {
			String addThisTime = allTheTimes.get(i).format(formatAmPm);
			timesToReturn.add(addThisTime);
		}
		return timesToReturn;
	}

	public ArrayList<String> getTimesThroughEndOfArray(int start) {
		ArrayList<String> timesToReturn = new ArrayList<>();
		for (int i = start; i < allTheTimes.size(); i++) {
			String addThisTime = allTheTimes.get(i).format(formatAmPm);
			timesToReturn.add(addThisTime);
		}
		return timesToReturn;
	}
	
	public ArrayList<String> getTimesFromStartToEnd(int start, int end) {
		ArrayList<String> timesToReturn = new ArrayList<>();
		for (int i = start; i <= end; i++) {
			String addThisTime = allTheTimes.get(i).format(formatAmPm);
			timesToReturn.add(addThisTime);
		}
		return timesToReturn;
	}
}