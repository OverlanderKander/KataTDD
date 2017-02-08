<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Babysitter Calculator</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>

<script>
	$(document).ready(function() {
		$("#startTime").change(function() {
			alert("The Start Time has been changed.");

		});
	});
</script>

<script>
	$(document).ready(function() {
		$("#endTime").change(function() {
			alert("The End Time has been changed.");
		});
	});
</script>

<script>
	$(document).ready(function() {
		$("#bedtime").change(function() {
			alert("The Bedtime has been changed.");
		});
	});
</script>

<body>

	<h1>Babysitting Calculator</h1>
	<h2>Hourly Rates:</h2>
	<table>
		<tr>
			<td>Start Time - Bedtime:</td>
			<td>$12</td>
		</tr>
		<tr>
			<td>Bedtime - Midnight:</td>
			<td>$8</td>
		</tr>
		<tr>
			<td>Midnight - End time:</td>
			<td>$16</td>
		</tr>
	</table>

	<form name="calculatorInput" action="showMeTheMoney" method="POST">
		<select id="startTime" name="startTime">
			<option selected disabled>Start Time</option>
			<c:forEach items="${possibleTimes}" var="hour">
				<option value="${hour}">${hour}</option>
			</c:forEach>
		</select> <select id="endTime" name="endTime">
			<option selected disabled>End Time</option>
<%-- 			<c:forEach items="${possibleTimes}" var="hour">
				<option value="${hour}">${hour}</option>
			</c:forEach> --%>
		</select> <select id="bedtime" name="bedtime">
			<option selected disabled>Bedtime</option>
<%-- 			<c:forEach items="${possibleTimes}" var="hour">
				<option value="${hour}">${hour}</option>
			</c:forEach> --%>
		</select> <input type="submit" value="Calculate">

	</form>

	<p>${jobDetails}
		<br>${jobAmount}
	</p>

</body>
</html>