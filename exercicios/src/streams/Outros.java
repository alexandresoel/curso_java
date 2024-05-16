package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.2);
		Aluno a2 = new Aluno("Lia", 5.2);
		Aluno a3 = new Aluno("Bia", 10.0);
		
		Aluno a4 = new Aluno("Ana", 7.2);
		Aluno a5 = new Aluno("Lia", 5.2);
		Aluno a6 = new Aluno("Bia", 10.0);
		
		Aluno a7 = new Aluno("Mario", 3.2);
		Aluno a8 = new Aluno("Luigi", 8.6);
		Aluno a9 = new Aluno("Peach", 9.1);
		
		
		List<Aluno> alunos = 
				Arrays.asList(a1, a2, a3, a4, a5 ,a6, a7, a8, a9);
		
		System.out.println("Distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
		.distinct()
		.skip(2)
		.forEach(System.out::println);
		
		alunos.stream()
		.distinct()
		.limit(2)
		.forEach(System.out::println);
		
		System.out.println("\nTake While..");
		
		alunos.stream()
		.distinct()
		.takeWhile(a -> a.nota >= 7.0)
		.forEach(System.out::println);
		
		
		
	}

}
