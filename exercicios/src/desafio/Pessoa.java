package desafio;

public class Pessoa {
	String nome;
	Double peso;
	
	Pessoa(String nome, Double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if(comida != null)
			this.peso += comida.peso;
		
	}
	
	String apresentar() {
		return "Olá eu sou "+ nome +" e tenho "+peso+" kgs.";
	}

}
