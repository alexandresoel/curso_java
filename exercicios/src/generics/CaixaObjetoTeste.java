package generics;

public class CaixaObjetoTeste {
	
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.aguardar(2.3); // double para object
		
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.aguardar("Ola"); // double para object
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
		
	}

}
