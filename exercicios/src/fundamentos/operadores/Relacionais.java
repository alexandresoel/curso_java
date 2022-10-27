package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 'a';
		int b = 97;
		
		System.out.println(a == b);
		System.out.println(3 > 7);
		System.out.println(3 < 7);
		System.out.println(3 <= 7);
		System.out.println(3 >= 3);
		System.out.println(30 != 7);
		
		double nota = 9.3;
		boolean temBomComportamento = true;
		boolean temDesconto = temBomComportamento && nota >= 7;
		System.out.println(temDesconto);
		
		

	}

}
