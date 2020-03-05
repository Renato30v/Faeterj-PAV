<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- 	<c:import url="logout-parcial.jsp"/> --%>
	
	<form action="${linkEntradaServlet}" method="post">
		
		Item: <input type="text" name="item" value="${product.item}" />
		Quantidade: <input type="text" name="quantity" value="${product.quantity}"/>
		Preço: <input type="text" name="price" value="${product.price}"/>
		<input type="hidden" name="id" value="${product.id}">	
		<input type="hidden" name="action" value="AlteraProduto">	
		<input type="submit" />
		
	</form>
</body>
</html>