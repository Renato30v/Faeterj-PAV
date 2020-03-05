<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conta</title>
</head>
<body>
	<form action="${linkEntradaServlet}" method="post">
		
		Item: <input type="text" name="item"/>
		Quantidade: <input type="text" name="quantity"/>
		Preço: <input type="text" name="price"/>
		
		<input type="hidden" name="action" value="NewProduct" />
		
		<input type="submit"/>
	
	</form>
	 

</body>
</html>