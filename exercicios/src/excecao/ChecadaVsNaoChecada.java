package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) throws Exception {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());		}
		geraErro2();
		
	}
	
	public static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro aqui! 01");
		
	}
	public static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro aqui! 02");
	}

}
