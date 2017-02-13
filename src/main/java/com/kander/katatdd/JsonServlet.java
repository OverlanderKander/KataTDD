package com.kander.katatdd;

import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;

public class JsonServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	ListOfTimes times = new ListOfTimes();
	ArrayList<String> allTimeOptions = times.getAllTimes();
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String startTimeSelected = request.getParameter("startOption"); 
		int selectedStart = allTimeOptions.indexOf(startTimeSelected);
		List<String> endList = times.getTimesThroughEndOfArray(selectedStart);
		String jsonEndOpions = null;
		jsonEndOpions = new Gson().toJson(endList);
		response.setContentType("application/json");
		response.getWriter().write(jsonEndOpions);
	}
}