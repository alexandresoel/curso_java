package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite a operação: ");
		String op = sc.next();
		
		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();
		String extenso = "";
		float resultado = 0;
		switch (op) {
		case "+": {
			extenso = "Adição";
			resultado = num1 + num2;
			break;
		}
		case "-": {
			extenso = "Subtração";
			resultado = num1 - num2;
			break;
		}
		case "*": {
			extenso = "Multiplicação";
			resultado = num1 * num2;
			break;
		}
		case "/": {
			extenso = "Divisão";
			resultado = num1 / num2;
			break;
		}
				}
		
		System.out.println("O resultado da "+extenso+" de "+num1+" por "+num2+" é de: "+resultado);
		
		sc.close();
		

	}

}
