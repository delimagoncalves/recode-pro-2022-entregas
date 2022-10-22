<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema NG - Viagens</title>
</head>
<body>
<fieldset>
		<legend>Menu - Destino</legend>
		<form action="controllerDestino" method="get">
			<label for="opcaoDestino"> 
			<input type="radio"
				name="opcaoDestino" value="cadastrar">CADASTRAR <input
				type="radio" name="opcaoDestino" value="listar">LISTAR <input
				type="radio" name="opcaoDestino" value="remover">REMOVER <input
				type="radio" name="opcaoDestino" value="atualizar">ATUALIZAR
			</label>
			<div>
				<input type="submit" value="ACESSAR">
			</div>
		</form>
	</fieldset>
</body>
</html>