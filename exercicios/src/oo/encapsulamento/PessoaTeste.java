package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(-45, "Pedro", null);
		p1.setIdade(235);
		
		System.out.println(p1);
		//p1.idade = -30; // alterar
		
		//System.out.println(p1.idade); // ler
	}

}
