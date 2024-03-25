package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	
	ArrayList<Item> itens = new ArrayList<Item>();
	
	
	void adcionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	
	void adcionarItem(String nome, double preco, int quantidade) {
		this.itens.add(new Item(new Produto(nome, preco), quantidade));
	}
	
	
	Double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		
		return total;
	}
	
	}
