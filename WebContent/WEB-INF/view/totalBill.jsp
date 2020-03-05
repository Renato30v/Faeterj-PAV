<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.List,br.com.pav.dividircontaweb.model.Product"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>
	
	<c:if test="${not empty product }">
		Produto ${products} cadastrado com sucesso!
	</c:if>

	Lista de produtos:
	<br />

	<ul>
		<c:forEach items="${products}" var="product">

			<li>
				${product.item} - ${product.quantity} - ${product.price}
				<a href="/dividircontaweb/entrada?action=MostraProduto&id=${product.id}">edita</a>
				<a href="/dividircontaweb/entrada?action=RemoveProduto&id=${product.id}">remove</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>