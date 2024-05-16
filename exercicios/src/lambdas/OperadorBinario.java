package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryOperator<Double> media = 
				( n1,  n2) -> (n1 + n2)/2;
		
		System.out.println(media.apply(9.4, 7.1));
		
		
		BiFunction<Double, Double, String> resultado =
				( n1,  n2) -> ((n1 + n2)/2) >= 7 ? "Aprovado": "Reprovado";
				
		System.out.println(resultado.apply(5.2, 7.9));
		
		Function<Double, String> conceito = 
				m -> m >= 7 ? "Aprovado" : "Reprovado";
				
				
		System.out.println(media.andThen(conceito).apply(4.1, 9.9));
	

	}

}
