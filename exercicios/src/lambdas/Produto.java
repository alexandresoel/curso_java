package lambdas;

public class Produto {
	
	@Override
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return nome + " tem preço final de R$: " + precoFinal ;
	}


	final String nome;
	final double preco;
	final double desconto;
	
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	

}
