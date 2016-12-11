<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<head>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/angular.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/trial.js"></script>
</head>
<body ng-app="trialModule">
<h1>List of Contacts</h1>
<p>Here you can see the list of the teams, edit them, remove or update.</p>
<table border="1px" cellpadding="0" cellspacing="0">
<thead>
<tr>
<th width="10%">id</th><th width="15%">First name</th><th width="10%">Last Name</th><th width="10%">Email</th>
<th>Date Created</th>
</tr>
</thead>
<tbody>
<h1>Normal flow</h1>
<c:forEach var="contact" items="${contacts}">
<tr>
	<td>${contact.firstName}</td>
	<td>${contact.lastName}</td>
	<td>${contact.telephone}</td>
	<td>${contact.email}</td>
	<td>${contact.created}</td>
	<td><a href="${pageContext.request.contextPath}/delete.pinneapple/${contact.id}">delete</a></td>
</tr>
</c:forEach>
</tbody>
</table>

<br/><br/><br/>
<h1>Angular flow</h1>
<div ng-controller="trialController">
{{myData}}	
<table border="1px" cellpadding="0" cellspacing="0">
<thead>
<tr>
<th width="10%">id</th><th width="15%">First name</th><th width="10%">Last Name</th><th width="10%">Email</th>
<th>Date Created</th>
</tr>
</thead>
<tbody>
<tr ng-repeat="x in myData">
	<td>{{x.firstName}}</td>
	<td>{{x.lastName}}</td>
	<td>{{x.telephone}}</td>
	<td>{{x.email}}</td>
	<td>{{x.created}}</td>
	<td><a href="${pageContext.request.contextPath}/delete.pinneapple/{{x.id}}">delete</a></td>
</tr>
</tbody>
</table>


</div>

<p><a href="${pageContext.request.contextPath}/index.pinneapple">Home page</a></p>

</body>
</html>