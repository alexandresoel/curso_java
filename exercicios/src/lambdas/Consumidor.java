package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 12.34, 0.04);
		Produto p2 = new Produto("Notebook", 3412.23, 0.04);
		Produto p3 = new Produto("Borracha", 1.33, 0.04);
		Produto p4 = new Produto("Lapis", 10.44, 0.04);
		Produto p5 = new Produto("Caderno", 42.98, 0.04);
		
		imprimir.accept(p1);
		
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
	}

}
