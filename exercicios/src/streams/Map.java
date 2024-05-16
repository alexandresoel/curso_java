package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("Ronda ", "BMW ", "Audi ");
		marcas.stream().map((m -> m.toUpperCase())).forEach(print);
		
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> minuscula = n -> n.toLowerCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) +"";
		UnaryOperator<String> grito = n -> n +"!!! ";
		
		System.out.println("\n Usando composição");
		marcas.stream()
		.map(minuscula)
		.map(primeiraLetra)
		.map(Utilitarios::grito)
		.forEach(print);
		

	}

}
