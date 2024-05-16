package generics;

public class ParesTeste {

	public static void main(String[] args) {
		
		Pares<Integer, String> resultadosConcurso = new Pares<>();	
		
		resultadosConcurso.adicionar(1, "Maria");
		resultadosConcurso.adicionar(2, "Jose");
		resultadosConcurso.adicionar(3, "Mia");
		resultadosConcurso.adicionar(4, "Joao");
		resultadosConcurso.adicionar(2, "Elias");
		
		System.out.println(resultadosConcurso.getValor(1));
		System.out.println(resultadosConcurso.getValor(4));
		System.out.println(resultadosConcurso.getValor(2));

	}

}
