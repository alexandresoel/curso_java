package excecao;

public class Causa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		metodoA(null);

	}
	
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (IllegalArgumentException e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
}
		
	}
	static void metodoB(Aluno aluno) {
		
		if (aluno == null) {
			throw new NullPointerException("Aluno esta NULO");
		}
		
		System.out.println(aluno.nome);
		
	}

}
