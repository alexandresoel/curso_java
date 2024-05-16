package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterDesafio {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 3500.00, 0.20, 30.0);
		Produto p2 = new Produto("Cafeteira", 350.00, 0.10, 0.0);
		Produto p3 = new Produto("Monitor", 800.00, 0.25, 30.0);
		Produto p4 = new Produto("Cadeira", 500.00, 0.25, 0.0);
		Produto p5 = new Produto("Pendrive", 100.00, 0.05, 0.0);
		Produto p6 = new Produto("Ventilador", 300.00, 0.15, 50.0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3,
				p4, p5, p6);
		
		Predicate<Produto> freteGratis = p -> p.frete == 0;
		Predicate<Produto> descontaco = p -> p.desconto >= 0.20;
		Function<Produto, String> valorFinal = p -> "O valor do "+ p.nome +" é de: " + (p.preco*(1-p.desconto))+" E tem frete gratis!!!";
		
		produtos.stream()
		.filter(descontaco)
		.filter(freteGratis)
		.map(valorFinal)
		.forEach(System.out::println);
		
	}

}
