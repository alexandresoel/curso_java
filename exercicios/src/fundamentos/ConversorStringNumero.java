package fundamentos;

import javax.swing.JOptionPane;

public class ConversorStringNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor1 = JOptionPane.showInputDialog(""
				+ "Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog(""
				+ "Digite o segundo número: ");
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		double soma = num1 + num2;
		System.out.println("O valor da soma é: " + soma);
		System.out.println("O valor da média é: " + soma / 2);
		
		

	}

}
