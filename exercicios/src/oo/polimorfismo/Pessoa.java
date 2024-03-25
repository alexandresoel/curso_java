package oo.polimorfismo;

public class Pessoa {

	private double peso;
	
	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}

	@Override
	public String toString() {
		return "Meu peso é: " + peso + " kg";
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0)
			this.peso = peso;
	}
}
