package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal!".charAt(2));
		
		//String é uma variavel imutavel
		//Vc consegue substituir o valor, mas não pode moodificar o valor original
		
		String s = 	"Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s+"!!!");
		System.out.println(s.startsWith("boa"));
		System.out.println(s.equalsIgnoreCase("boa"));
		System.out.println(s.length());
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.678;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome +
				"\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
		/* para o printf retornar usar a seguinte notação:
		*	%s - STRING
		*	%d - INT
		*	%f - FLOAT .N define a quantidade de casas decimais
		*/
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}

}
