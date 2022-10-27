package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (v ou f)
		// Trabalho na quinta (v ou f)
		Scanner sc = new Scanner(System.in);
		System.out.println("O primeiro trabalho deu certo? ");
		boolean trabalho1 = sc.nextBoolean();
		
		System.out.println("O segundo trabalho deu certo? ");
		boolean trabalho2 = sc.nextBoolean();
		
		if(trabalho1 && trabalho2) {
			System.out.println("Iremos comprar a TV de 50 polegadas");
			System.out.println("Iremos tomar sorvete");
			
		}
		else if (trabalho1 || trabalho2) {
			System.out.println("Iremos comprar a TV de 32 polegadas");
			System.out.println("Iremos tomar sorvete");
		}
		else {
			System.out.println("Iremos ficar em casa");
		}
		
		sc.close();
		

	}

}
