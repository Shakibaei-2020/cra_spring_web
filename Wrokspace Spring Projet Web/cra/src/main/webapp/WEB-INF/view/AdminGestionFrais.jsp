<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h2> Gestion Frais</h2></center>

		
<!-- **********************************DELETE************************************** -->
<hr>
<p>Delete</p>

<form method="post" action="/home2/DeleteFrais" method="post">
<input name="fieldId" type="text" value="id" />



<input type="submit" value="Delete"/>
</form>
<!-- **********************************UPDATE************************************** -->
<hr>
<p>Update</p>
<form method="post" action="/home2/UpdateFrais" method="post">

<input name="fieldId" type="text" value="id" />
<input name="fieldRaison" type="text" value="raison" />
<input name="fieldPrix" type="text" value="idPrix" />
<input name="fieldDate" type="date" value="idDate" />
<input name="fieldIdColl" type="text" value="idColl" />

<input type="submit" value="Delete"/>
</form>
<!-- **********************************SELECT************************************** -->
<hr>
<p>Select</p>
<p> ${tabFrais} </p>

<!-- **********************************SELECT************************************** -->

<form name="Pomme" action="/home2/CheckFrais" method="post">
 	<input name="fieldIdColl" type="text" value="fieldIdColl" />
<p>${ tabFraisColl }</p>
</form>
		
		
</body>
</html>