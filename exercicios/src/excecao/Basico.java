package excecao;

public class Basico {
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
		imprimir(a1);
		} catch(Exception excecao) {
			System.out.println("Ocorreu um erro no momento de "
					+ "imprimir o nome do usuario");
		}
		
		try {
			System.out.println( 7 / 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Ocorreu o erro: "+ e.getMessage());
		}
		
		System.out.println( "Fim :)");
		
	}
	
	public static void imprimir(Aluno aluno) {
		System.out.println(aluno.nome);
	}

}
