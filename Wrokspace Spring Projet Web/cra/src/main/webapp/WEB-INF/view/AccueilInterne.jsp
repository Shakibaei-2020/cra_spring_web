<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<body>
 
<center><h2>Accueil Interne</h2></center>

<hr>
<p>Ajout Note de Frais</p>
<form method="post" action="/home2/AjoutFrais" method="post">

<input name="fieldId" type="text" value="id" />
<input name="fieldRaison" type="text" value="raison" />
<input name="fieldPrix" type="text" value="Prix" />
<input name="fieldDate" type="Date" value="Date" />
<input name="fieldIdColl" type="text" value="idColl" />

<input type="submit" value="ajout"/>
</form>


</body>
</html>