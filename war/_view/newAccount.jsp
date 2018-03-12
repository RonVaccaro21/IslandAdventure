<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Island Adventure - New Account</title>
		<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
		<!-- Enter this into URL: http://localhost:8081/IslandAdventure/login -->
	</head>

	<body>
		<div id= "titleText">
			<h1>Island Adventure</h1>
		</div>
		
		<div id= "titleText">
			<h2>New Account</h2>
		</div>
		
		<div id= "inputBox">
			
			<form action="${pageContext.servletContext.contextPath}/newAccount" method="post">
				Username:<input type="text" name="action" size="20" value="${action}" />
				<br><br>
				Password:<input type="text" name="action" size="20" value="${action}" />
				<br><br>
				Confirm Password:<input type="text" name="action" size="20" value="${action}" />
				<br><br>
				<input type="Submit" name="submit" value="Create Account!">
			</form>
		</div>
		
		<div id= "inputBox">
			<form action="${pageContext.servletContext.contextPath}/newAccount" method="post">
				<input type="Submit" name="back2Login" value="Back to Login">	
			</form>
		</div>
		
		
	</body>
</html>
