<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NG - Viagens</title>
</head>
<body>
	<h1>Cadastro de Destinos</h1>
	<fieldset>
		<legend>Informações do Destino</legend>
		<form method="post" action="cadastrarDestino" >
			Sigla do estado:<input type="text" name="estado"> 
			Nome da cidade:<input type="text" name="cidade">
			Valor da diária:<input type="text" name="diaria">
			<input type="submit" value="CADASTRAR"> 	
		</form>
	</fieldset>
</body>
</html>