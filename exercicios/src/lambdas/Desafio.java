package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		/*
		 * 1. A partir do produto calcular o preco real
		 * 2. imposto municipal >= 2500 (8.5%) <2500 (isento)
		 * 3. Frete: >=3000(100) / <3000 (50)
		 * 4. Arredondar dois digitos
		 * 5. Formatar: R$ 1234.00 
		 * 
		 * 
		 */
		
		
		UnaryOperator<Double>  impostoMunicipal = 
				valor -> valor >=  2500 ? valor * 1.085 : valor;
		
		UnaryOperator<Double>   frete = 
						valor -> valor >=  3000 ? valor + 100.0 : valor + 50.0;
						
		UnaryOperator<Double>   arredondar = 
								valor -> Math.round(valor * 100.0)/100.0;				
						
	    Function<Double, String> formatar =
	    		valor -> ("R$" + valor).replace(".", ",");
						
		
		
		Function<Produto, Double> precoFinal =
				p -> p.preco * (1-p.desconto);
		
		Produto p = new Produto("Ipad", 3235.81, 0.13);
		
		System.out.println(impostoMunicipal
				.andThen(frete)
				.andThen(arredondar)
				.apply(p.preco));
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
				
		
		System.out.println(preco);
				
				
		
		
		
	}

}
