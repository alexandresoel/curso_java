package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//informações de um funcionario
		
		//tipos numerais de inteiro
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//tipos numerais reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo Booleano
		boolean estaDeFerias = true; // false
		
		// Tipo caractere
		char status = 'A'; //Ativo
		
		// Dias de empresa
		System.out.println("Quantidade de dias na empresa: " +anosDeEmpresa * 365);
		
		// Número de viagnes
		System.out.println("Quantidade de viagens realizadas: " + numeroDeVoos/2);
		
		// Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + " Ganha: " + salario);
		System.out.println("Esta de Ferias? " + estaDeFerias);
		System.out.println(status);
		
		
		
		
		
		
		
	}

}
