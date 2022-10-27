package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double media = 7.6;
		//(CONDICAO) ? VERDADEIRO : FALSO
		
		String resultadoRecuperacao = media >= 5.0 ? "Em recuperação" : "Reprovado";
		String resultado = media >= 7.0 ? "Aprovado" : resultadoRecuperacao;
		
		String ternarioMultiplo = media >= 7.0 ? "Aprovado": media >= 5.0 ? "Em recuperação" : "Reprovado";
		
		System.out.println(resultado);

	}

}
