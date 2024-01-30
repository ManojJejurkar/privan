<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.privan.model.Model" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shot Attempt Page</title>
</head>
<body>
	<form action="save" method="post">
		<pre>
Team Name:     <input type="text" name="teamName">

Player Id:      <input type="text" name="playerName">

Shot Attempt: <input type="text" <c:out value="${threePlus+threeMin+twoPlus+twoMin+ftPlus+ftMin}"/>name="shotAttempt">

3+: 		  <input type="text" name="threePlus">

3- :		  <input type="text" name="threeMin">

2+:			  <input type="text" name="twoPlus">

2- :		  <input type="text" name="twoMin">

FT+:		 <input type="text" name="ftPlus">

FT- :		  <input type="text" name="ftMin">


<input type="submit" value="SAVE" style="background: lightblue">

</pre>
	</form>
</body>
</html>