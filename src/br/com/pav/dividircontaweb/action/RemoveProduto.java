package br.com.pav.dividircontaweb.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pav.dividircontaweb.model.Banco;

public class RemoveProduto implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Removendo produto");

		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Banco banco = new Banco();
		banco.removeProduto(id);
		
		return "redirect:entrada?action=Bill";
	}
}
