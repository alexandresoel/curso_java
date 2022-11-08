package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a média: ");
		double media = sc.nextDouble();
		
		if (media >= 7.0)
			System.out.println("Aluno aprovado");
		
		boolean criterioDeReprovacao = 
				media < 4.5 && media >= 0.0;
		
		if (criterioDeReprovacao)
			System.out.println("Aluno Reprovado");
		
		sc.close();

	}

}
