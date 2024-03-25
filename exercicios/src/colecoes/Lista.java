package colecoes;

import java.util.ArrayList;
import java.util.Iterator;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); //acessar pelo indice
		
		
		for (Usuario usuario : lista) {
			System.out.println(usuario.toString());
		}
		
		
	}
}
