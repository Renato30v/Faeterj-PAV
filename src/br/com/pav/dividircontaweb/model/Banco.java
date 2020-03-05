package br.com.pav.dividircontaweb.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Product> list = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {
		Product product = new Product();
		product.setId(chaveSequencial++);
		product.setItem("Sorvete");
		product.setQuantity(5);
		product.setPrice(25.0);
		list.add(product);

		Product product2 = new Product();
		product2.setId(chaveSequencial++);
		product2.setItem("Pizza");
		product2.setQuantity(2);
		product2.setPrice(70.0);
		list.add(product2);
	}

	public void add(Product product) throws IOException {

//		FileWriter fw = new FileWriter("d:\\conta.txt"); 
		PrintWriter pw = new PrintWriter("d:\\conta.txt");
		
		product.setId(Banco.chaveSequencial);
		list.add(product);

		Iterator<Product> it = list.iterator();
		while (it.hasNext()) {
			pw.print(it.next());
		}

		pw.close();
	}

	public List<Product> getProducts() {
		return Banco.list;
	}

	public void removeProduto(Integer id) {

		Iterator<Product> it = list.iterator();

		while (it.hasNext()) {
			Product product = it.next();

			if (product.getId() == id) {
				it.remove();
			}
		}

	}
	
	public Product buscaProdutoPelaId(Integer id) {
		for (Product product : list) {
			if(product.getId() == id) {
				return product;
			}
			
		}
		return null;
	}

}
