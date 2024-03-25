package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.4);
		conjunto.add(1);
		conjunto.add(null);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add("x");
		
		System.out.println(conjunto.size());
		
		//não aceita elementos repitidos
		
		conjunto.add("Teste");
		System.out.println(conjunto.size());
		//removendo
		System.out.println(conjunto.remove("x"));
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("x"));
		
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.contains("x"));
		System.out.println(conjunto.contains("Teste"));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums);//União entre dois conjuntos
		conjunto.retainAll(nums);// interseção entre dois conjuntos
		System.out.println(conjunto);
		

	}

}
