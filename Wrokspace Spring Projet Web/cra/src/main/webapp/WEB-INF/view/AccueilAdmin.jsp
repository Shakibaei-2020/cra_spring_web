<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<body>
 
 <center><h2> Accueil Admin</h2>



<div style="border: solid;">
<h1>Gestions des collaborateurs</h1>
<form name="home" action="/home/GestionCollab" method="post" >
<input type="submit" value="Actions Collaborateur">
</form>
<br>
<br>
</div>

<br>

<div style="border: solid;">
<h1>Gestion des notes de frais</h1>
<form name="Pommes" action="/home2/GestionFrais" method="post">
<input type="submit" value="Actions note de Frais">
</form>
<br>
<br>
</div>

</center>
</body>
</html>