package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<List<String>> umaLista =
				() -> Arrays.asList("Ana","Lia","Gui"); //como não é obrigado a passar os parametros de entrada tem que por os ()
				
		System.out.println(umaLista.get());		

	}

}
