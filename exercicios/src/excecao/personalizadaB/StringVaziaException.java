package excecao.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception{
	private String nomeDoAtributo;

	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	
	public String getMessage() {
		// TODO Auto-generated method stub
		return String.format("O atributo %s esta Vazio.",
				nomeDoAtributo);
	}
	

}
