package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		List<String> listaDeAprovados = Arrays.asList("Gui", "Ana", "Paul", "Luca");
		
		for(String nome:listaDeAprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando Iterator...");
		Iterator<String> iterator = listaDeAprovados.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nUsando Stream...");//Stream é uma sequencia de dados
		Stream<String> st = listaDeAprovados.stream();
		st.forEach(System.out::println);
		
	}

}
