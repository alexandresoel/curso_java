package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Não: int -> Double
		// double -> Double
		
		BinaryOperator<Double> calc = (x, y) -> {return x + y;};
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x, y) ->  x * y;
		System.out.println(calc.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calc2 = (x, y) -> {return x + y;};
		System.out.println(calc2.apply(3, 3));
		
		
	}

}
