<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP</title>
</head>
<body>

<%-- <%for(int i=0;i<10;i++){ %>
<h3>the given number =<%=i%></h3>
<%} %> --%>

<h4>Year=<%=LocalDate.now().getYear() %></h4>
<h4>Day=<%=LocalDate.now().getDayOfWeek() %></h4>
<h4>Month=<%=LocalDate.now().getYear() %></h4>
<h5>Time=<%=LocalTime.now().getHour() %></h5>
<h5>Time=<%=LocalTime.now().getMinute() %></h5>
<h5>Time=<%=LocalTime.now().getSecond() %></h5>

</body>
</html>