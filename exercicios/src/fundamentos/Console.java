package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" Dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("Dia!");
		
		System.out.printf("Megasena %d %d %d %d %d ", 1, 2, 3, 4, 5);
		System.out.printf("Salario: %.1f%n",12354.5657);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.println("Digite a sua idade: ");
		int idade = entrada.nextInt();
		System.out.printf("%s %s tem %d anos", nome, sobrenome, idade);
		entrada.close();
	}

}
