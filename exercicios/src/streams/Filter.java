package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno a1 = new Aluno("Bia", 7.8);
		Aluno a2 = new Aluno("Lia", 7.2);
		Aluno a3 = new Aluno("Fia", 7.5);
		Aluno a4 = new Aluno("Mia", 3.1);
		Aluno a5 = new Aluno("Jon", 6.2);
		Aluno a6 = new Aluno("Max", 4.5);
		Aluno a7 = new Aluno("Nia", 8.1);
		Aluno a8 = new Aluno("Noe", 7.9);
		Aluno a9 = new Aluno("Lis", 9.6);
		Aluno a10 = new Aluno("Ste", 1.2);
		Aluno a11 = new Aluno("Fly", 3.1);
		
		List<Aluno> alunos =
				Arrays.asList(a1,a2,a3,a4,a5,a6,
						a7,a8,a9,a10,a11);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado =
				a -> "Parabéns " + a.nome + "Voce foi aprovado(a)!";
		
		alunos.stream()
		.filter(aprovado)
		.map(saudacaoAprovado)
		.forEach(System.out::println);

	}

}
