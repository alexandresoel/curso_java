package desafio;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comida c1 = new Comida("Arroz", 0.300);
		Comida c2 = new Comida("Feijão", 0.700);
		Pessoa p1 = new Pessoa("João", 99.0);
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());

	}

}
