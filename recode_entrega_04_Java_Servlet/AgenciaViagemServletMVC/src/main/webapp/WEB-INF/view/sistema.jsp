<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema NG - Viagens</title>
</head>
<body>
<h2>SISTEMA NG - VIAGENS</h2>
<fieldset>
	<legend>Selecione uma opção</legend>
	<form action="controller" method="get">
		<label for="opcaoSistema">
			<input type="radio" name="opcaoSistema" value="cliente">CLIENTE
			<input type="radio" name="opcaoSistema" value="destino">DESTINO
			<input type="submit" value="ACESSAR">
		</label>
	</form>
</fieldset>
</body>
</html>