package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		List<String> langs = Arrays.asList("JS", "PHP", "JAVA", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		Integer ultimoNumero = (Integer) ListaUtil.getUltimo(nums);
		System.out.println(ultimoNumero);
		
		String ultimaLinguagem = (String) ListaUtil.getUltimo(langs);
		System.out.println(ultimaLinguagem);
		
		Integer ultimoNumero2 =  ListaUtil.getUltimo2(nums);
		System.out.println(ultimoNumero2);
		
		String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem2);


	}

}
