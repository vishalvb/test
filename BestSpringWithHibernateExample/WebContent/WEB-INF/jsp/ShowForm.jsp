<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<body>
<h1>Vishal bhangi's add form</h1>
<p>add contact form.</p>
<form:form method="POST" commandName="contact" action="${pageContext.request.contextPath}/process.pinneapple">
<table>
<tbody>
	<tr>
		<td> pehlu naam: </td>
		<td><form:input path="firstName"></form:input></td>
	</tr>
	<tr>
		<td>atak:</td>
		<td><form:input path="lastName"></form:input></td>
	</tr>
	<tr>
		<td>Telephone:</td>
		<td><form:input path="telephone"></form:input></td>
	</tr>
	<tr>
		<td>Email:</td>
		<td><form:input path="email"></form:input></td>
	</tr>
	<tr>
		<td>janm divas:</td>
		<td><form:input path="created"></form:input></td>
	</tr>
	
	<tr>
		<td><input value="Add" type="submit"></td>
		<td></td>
	</tr>
</tbody>
</table>
</form:form>

<p><a href="${pageContext.request.contextPath}/index.pinneapple">Home page</a></p>
</body>
</html>