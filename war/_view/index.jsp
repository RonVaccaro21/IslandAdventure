<!DOCTYPE html>

<html>
	<head>
		<title>Index view</title>
	</head>

	<body>
		<form action="${pageContext.servletContext.contextPath}/index" method="post">
			<input type="submit" name="addNumbers" value="Add Numbers">
			<input type="submit" name="multiplyNumbers" value="Multiply Numbers">
			<input type="submit" name="guessingGame" value="Guessing Game">
		</form>
	</body>
</html>
