package br.com.pav.dividircontaweb.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pav.dividircontaweb.model.Banco;
import br.com.pav.dividircontaweb.model.Product;

public class Bill implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Conta");

		Banco banco = new Banco();
		List<Product> lista = banco.getProducts();

		request.setAttribute("products", lista);
		
		return "forward:totalBill.jsp";
		
	}
}
