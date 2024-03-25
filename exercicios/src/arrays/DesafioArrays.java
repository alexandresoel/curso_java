package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrays {
	public static void main(String[] args) {
		System.out.println("Digite a quantidade de provas: ");
		Scanner sc = new Scanner(System.in);
		int provas = sc.nextInt();
		Double[] notas = new Double[provas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota "+(i+1)+": ");
			notas[i] = sc.nextDouble();
			
		}
		System.out.println(Arrays.toString(notas));
	}

}
