package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String vcDiz = "";
			Scanner sc = new Scanner(System.in);
			do {
				System.out.print("Você diz..");
				vcDiz = sc.nextLine();
				}
			while(vcDiz.equalsIgnoreCase("sair"));


			sc.close();
			
		
	}

}
