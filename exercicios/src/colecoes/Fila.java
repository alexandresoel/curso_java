package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		//Offer e Add -> adicionam elementos da fila
		// Diferença é o comportamento quando a fila está cheia
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obter o próximo elemento na fila (sem remover)
		
		System.out.println(fila.peek()); //retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); //lança uma exceçao
		System.out.println(fila.element());
		
		//Diferença é o comportamento 
		//quando a fila está vazia!
		System.err.println(fila.poll());
		System.err.println(fila.poll());
		System.err.println(fila.remove());
		System.err.println(fila.poll());
		System.err.println(fila.poll());
		System.err.println(fila.poll());
		System.err.println(fila.poll());
	}

}
