<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/main.css"
	type="text/css">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring Tutorial 98</title>
</head>
<body>

	<!--  sf = spring forms -->

	<sf:form method="post"
		action="${pageContext.request.contextPath}/createaccount"
		commandName="user">
		<table class="formtable">

			<tr>
				<td class="label">Username:</td>
				<td><sf:input class="control" path="username" name="username"
						type="text" /><br />
				</td>
			</tr>
			<tr>
				<td class="label">Email:</td>
				<td><sf:input class="control" path="email" name="email"
						type="text" /><br />
				</td>
			</tr>
			<tr>
				<td class="label">Password:</td>
				<td><sf:input class="control" path="password" name="password"
						type="text" /><br />
				</td>
			</tr>
			<tr>
				<td class="label">Confirm Password:</td>
				<td><input class="control"  name="confirmpass"
						type="text" /><br />
				</td>
			</tr>
			<tr>
				<td class="label">&nbsp;</td>
				<td><input class="control" value="Create Advert" type="submit" /></td>
			</tr>


		</table>
	</sf:form>



</body>
</html>