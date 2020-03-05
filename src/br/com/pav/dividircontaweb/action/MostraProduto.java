package br.com.pav.dividircontaweb.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pav.dividircontaweb.model.Banco;
import br.com.pav.dividircontaweb.model.Product;

public class MostraProduto implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("mostrando dados do produto");

		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Banco banco = new Banco();

		Product product = banco.buscaProdutoPelaId(id);

		request.setAttribute("product", product);

		return "forward:formAlteraProduto.jsp";
	}
}
