package br.com.pav.dividircontaweb.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pav.dividircontaweb.model.Banco;
import br.com.pav.dividircontaweb.model.Product;

public class AlteraProduto implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String paramItem = request.getParameter("item");
		String paramQuantity = request.getParameter("quantity");
		String paramPrice = request.getParameter("price");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println("acao altera produto" + id);

		Banco banco = new Banco();
		Product product = banco.buscaProdutoPelaId(id);
		product.setItem(paramItem);
		product.setQuantity(Integer.parseInt(paramQuantity));
		product.setPrice(Double.parseDouble(paramPrice));

		return "redirect:entrada?action=Bill";

	}
}
