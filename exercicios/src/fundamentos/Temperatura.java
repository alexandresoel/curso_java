package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// Formula (F - 32) x 5/9 = Cº
		final double FATOR = 5/9.0;
		final double AJUSTE = 32;
		
		double fah = 86;
		double celcius = (fah - AJUSTE) * FATOR;
		System.out.println(celcius);
		
		
	}
}
