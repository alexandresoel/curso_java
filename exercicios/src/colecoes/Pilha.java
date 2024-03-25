package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.remove());
		
		
		

	}

}
