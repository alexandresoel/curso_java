package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);


		
		Double nota = 0.0;
		Double media = 0.0;
		int contador = 0;
		int total = 0;
		
		while (nota != -1) {
			System.out.println("Digite uma nota ou -1 para sair: ");
			nota = sc.nextDouble();
			 if (nota >= 0.0 && nota <= 10.0  ) {
				 media += nota;
				 contador++;
			}else if(nota != -1) {
				System.out.println("Favor digite uma nota válida!");
			}
				total++;
			
			
		} 
		
		media = media/contador;
		
		System.out.println("Das "+total+" notas, apenas "+contador+" são válidos e sua média é: "+media);
		sc.close();
	}

}
