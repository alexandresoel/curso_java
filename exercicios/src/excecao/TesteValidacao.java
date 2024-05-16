package excecao;

import excecao.personalizadaA.NumeroForaIntervaloException;
import excecao.personalizadaA.StringVaziaException;
import excecao.personalizadaA.Validar;

public class TesteValidacao {
	
	public static void main(String[] args) {
		try {
			Aluno aluno = new Aluno("", -7);
			Validar.aluno(aluno);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		}catch (NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
