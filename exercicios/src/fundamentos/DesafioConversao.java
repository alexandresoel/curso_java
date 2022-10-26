package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in);
		System.out.println("Digite o primeiro salario: ");
		String salario1 = sc.nextLine().replace(",", ".");
		System.out.println("\nDigite o primeiro salario: ");
		String salario2 = sc.nextLine().replace(",", ".");
		System.out.println("\nDigite o primeiro salario: ");
		String salario3 = sc.nextLine().replace(",", ".");
		
		
		double sl1 = Double.parseDouble(salario1);
		double sl2 = Double.parseDouble(salario2);
		double sl3 = Double.parseDouble(salario3);
		
		System.out.println("A média dos Salarios é de: "+( sl1 + sl2 + sl3 )/3);
		
		
		
		sc.close();

	}

}
