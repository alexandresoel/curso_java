package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma nota: ");
		
		double nota = sc.nextDouble();
		
		if(nota < 0.0 || nota >10.0){
			System.out.println("Nota inválida");
		}else if(nota >= 8.1) {
			System.out.println("Nota conceito A");
		}else if(nota >= 6.1) {
			System.out.println("Nota conceito B");
		}
		

	}

}
