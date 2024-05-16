package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnaryOperator<Integer> maisDois =
				n -> n + 2;
		UnaryOperator<Integer> vezesDois =
				n -> n * 2;
		UnaryOperator<Integer> aoQuadrado =
				n -> n * n;
				
		int resultado1 = maisDois //le-se de cima para baixo
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		int resultado2 = maisDois //le-se de baixo para cima
				.compose(vezesDois)
				.compose(aoQuadrado)
				.apply(0);
		
		System.out.println(resultado1);
		System.out.println(resultado2);

	}

}
