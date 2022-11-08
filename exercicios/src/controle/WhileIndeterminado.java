package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Você diz..");
		String vcDiz = sc.nextLine();
		String aux = "sair";
		
		while (!vcDiz.equalsIgnoreCase(aux)) {
			System.out.println("Você diz..." + vcDiz+"!");
			System.out.print("Você diz..");
			vcDiz = sc.nextLine();
			
			
		}
			
		sc.close();
		

	}

}
