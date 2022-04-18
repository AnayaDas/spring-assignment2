<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style = "color:blue;">Coursera</h1>
<h2 style = "color:purple;">Available Courses</h2>
 <c:forEach items="${courseList}" var="course">
  Course Name : ${course.getCourse_name()}<br>
  Fees : Rs.${course.getFees()}<br>
  Duration : ${course.getCourse_duration()} weeks <br>
  Start Date : ${course.getStartDate()} <br>
  <a href="" class="link">Enroll</a> <br> <br>
 </c:forEach>
</body>
</html>