package com.kander.katatdd;

import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;

public class BedServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	ListOfTimes times = new ListOfTimes();
	ArrayList<String> allTimeOptions = times.getAllTimes();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String startTimeSelected = request.getParameter("startOption");
		System.out.println("bedStart: " + startTimeSelected);
		String endTimeSelected = request.getParameter("endOption");
		System.out.println("bedEnd: " + endTimeSelected);
		int selectedStart = allTimeOptions.indexOf(startTimeSelected);
		int selectedEnd = allTimeOptions.indexOf(endTimeSelected);
		List<String> bedList = times.getTimesFromStartToEnd(selectedStart, selectedEnd);
		String jsonBedOptions = null;
		jsonBedOptions = new Gson().toJson(bedList);
		response.setContentType("application/json");
		response.getWriter().write(jsonBedOptions);
	}
}
