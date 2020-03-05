package br.com.pav.dividircontaweb.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pav.dividircontaweb.model.Banco;
import br.com.pav.dividircontaweb.model.Product;

public class NewProduct implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Cadastrando novo produto");

		String paramItem = request.getParameter("item");
		String paramQuantity = request.getParameter("quantity");
		String paramPrice = request.getParameter("price");

		Product product = new Product();
		product.setItem(paramItem);
		product.setQuantity(Integer.parseInt(paramQuantity));
		product.setPrice(Double.parseDouble(paramPrice));
		
		Banco banco = new Banco();
		banco.add(product);

		request.setAttribute("products", product);

		// redirecionando pelo navegador
		return "redirect:entrada?action=Bill";

	}
}
