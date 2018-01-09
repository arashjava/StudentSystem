<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix='form' uri='http://www.springframework.org/tags/form'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<jsp:useBean id="now" class="java.util.Date" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- FIX: Change to mvc mapping -->
<link rel="stylesheet"
	href="<c:url value="/resources/styles/registrationForm.css" />">
<script src="<c:url value="/resources/data/counriesProvincesData.js" />"
	type="text/javascript"></script>
<script
	src="<c:url value="/resources/scripts/counriesProvincesFunctions.js" />"
	type="text/javascript"></script>

</head>
<body>

	<div class="container">
		<h1>Entering Marks</h1>
		<p>Search results for user: "${userName}"</p>
		<br> <br>
		<form:form action="search" method="post" commandName="search_result">
			<div class="form-group row">
				<div class="col-xs-7">
					<label for="courseList">Course Name</label> 

					<form:select	id="courseId" path="course.courseName">
						<c:forEach items="${courses}" var="course">
						<form:option value="${course.courseId}">${course.courseName}</form:option>
						</c:forEach>
					</form:select>
					


				</div>
				<div class="col-xs-2">
					<label for="semester">Semester</label><br> 
				<form:radiobutton path="semester" value="1" checked= 'checked' /> January<br> 
				<form:radiobutton	path="semester" value="2" /> September<br>
				</div>
				<div class="col-xs-2">
					<label for="year">Year</label><br>
					<fmt:formatDate var="datetime" value="${now}" />
					<c:set var="length" value="${fn:length(datetime)}" />
					<c:set var="year" value="${fn:substring(datetime,length-4, length)}" />
					<select id="year" name="year">
						<c:forEach begin="0" end="10" var="val">
							<c:set var="decr" value="${year- val}" />
							<option value="${decr}">${decr}</option>
						</c:forEach>
					</select>
				</div>


					
					<input type="hidden" name="action" value="search"> 
				<input 	type="hidden" name="userName" value="${userName}">

				<h4 class="col-xs-6 form-control"></h4>
				<div class="col-xs-5">
					<input class="form-control" type="submit" value="Submit">
				</div>

				<div class="col-xs-5">
					<input class="form-control" type="reset" value="Reset">
				</div>
				<!-- FIX: Missing end div tag -->
			</div>
		</form:form>
	</div>



</body>
</html>