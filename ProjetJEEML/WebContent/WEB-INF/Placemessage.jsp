<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=1 align=center leftmargin=10 width=500px height=300px cellspacing=5><tr><td>
				<form method="POST" action="ajouteretabilissement.php" >
					<label for="nom_etab"> Le Nom du etabilissement     :</label>
						<div class="from"><input type="text" name="nom_etab" id="nom_etab">
	<br/><br/>
	<p>
		<label for="nom_garage"> Adresse de l'etabilissement    :</label>
	<div class="from">	<input type="text" name="adr_etab" id="adr_etab"> </div>

	<br/><br/>
				<div class="from"><input type='submit' name='Ajouter' value="Ajouter"></div>
</td></tr></table>
	</form>

</body>
</html>