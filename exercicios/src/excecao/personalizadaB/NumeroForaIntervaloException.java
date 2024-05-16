package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {
	
	private String nomeDoAtributo;

	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	
	public String getMessage() {
		// TODO Auto-generated method stub
		return String.format("O atributo %s esta fora do intervalo.",
				nomeDoAtributo);
	}
	
}
