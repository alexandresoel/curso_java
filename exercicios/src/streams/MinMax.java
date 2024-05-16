package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno("Ana", 7.2);
		Aluno a2 = new Aluno("Lia", 5.2);
		Aluno a3 = new Aluno("Bia", 10.0);
		
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		Comparator<Aluno> melhorNota = (aluno1, aluno2) ->{
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return -1;
			return 0;
			
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
 

	}

}
