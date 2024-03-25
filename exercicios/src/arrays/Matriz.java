package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos? ");
		int qntAlunos = sc.nextInt();
		
		System.out.println("Quantas notas por Aluno? ");
		int qntNotas = sc.nextInt();
		
		double[][] notasDaTurma = new double[qntAlunos][qntNotas];
		double total = 0;
		for(int i = 0;i < notasDaTurma.length;i++) {
			for(int j = 0;j < notasDaTurma[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d: ",j,i);
				notasDaTurma[i][j] = sc.nextDouble();
				total += notasDaTurma[i][j];
			}
		}
		
		double media = total/(qntAlunos*qntNotas);
		System.out.println("A media da turma é: "+media);
		

		sc.close();

	}

}
