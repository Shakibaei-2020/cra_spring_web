<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h2> Gestion Collaborateur</h2></center>

<!-- **********************************AJOUT************************************** -->
<hr>

<p>Ajout</p>

<form method="post" action="/home/UpdateCo" method="post">

 	<input name="fieldId" type="text" value="id" />
 	<input name="fieldMail" type="text" value="Mail" />
 	<input name="fieldMdp" type="text" value="mot de passe" />
 	<input name="fieldNom" type="text" value="nom" />
 	<input name="fieldType" type="text" value="type" />
 	
 	 <input type="submit" value="Ajout">
 	
</form>

<!-- **********************************DELETE************************************** -->
<hr>
<p>Delete</p>

<form method="post" action="/home/DeleteCo" method="post">
<select name="fieldId" id="fieldId" >
<c:forEach items="${ tabColl }" var="tabColl" varStatus="status">
   <p><option><c:out value="${ tabColl.id }" /></option></p>
</c:forEach>     	
   </select> 
<input type="submit" value="Delete"/>

</form>
<!-- **********************************UPDATE************************************** -->
<hr>

<p>Update</p>

<form name="Pomme" action="/home/UpdateCo" method="post">

<select name="fieldId" id="fieldId" >
<c:forEach items="${ tabColl }" var="tabColl" varStatus="status">
   <p><option><c:out value="${ tabColl.id }" /></option></p>
</c:forEach>     	
   </select> 
 	<input name="fieldMail" type="text" value="Mail" />
 	<input name="fieldMdp" type="text" value="mot de passe" />
 	<input name="fieldNom" type="text" value="nom" />
 	<input name="fieldType" type="text" value="type" />
 
 <input type="submit" value="Update">

</form>
<!-- **********************************SELECT************************************* -->
<hr>

<p>Select</p>
<select name="fieldId" id="fieldId" >
<c:forEach items="${ tabColl }" var="tabColl" varStatus="status">
   <p><option><c:out value="${ tabColl }" /></option></p>
</c:forEach>     	
   </select> 

<hr>
<!-- **********************************SELECT************************************* -->


</body>
</html>