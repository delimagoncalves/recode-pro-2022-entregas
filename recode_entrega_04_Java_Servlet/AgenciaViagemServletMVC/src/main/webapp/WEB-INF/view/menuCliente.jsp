<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SISTEMA Ng - Viagens</title>
</head>
<body>
	<fieldset>
		<legend>Menu - Cliente</legend>
		<form action="controllerCliente" method="get">
			<label for="opcaoCliente"> <input type="radio"
				name="opcaoCliente" value="cadastrar">CADASTRAR <input
				type="radio" name="opcaoCliente" value="listar">LISTAR <input
				type="radio" name="opcaoCliente" value="remover">REMOVER <input
				type="radio" name="opcaoCliente" value="atualizar">ATUALIZAR
			</label>
			<div>
				<input type="submit" value="ACESSAR">
			</div>
		</form>
	</fieldset>

</body>
</html>