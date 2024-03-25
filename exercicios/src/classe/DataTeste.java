package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data(31,12,2020);
		
		String dataFormatada1 = d1.obterDataInformada();
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataInformada());
		
		d1.imprimirDataInformada();
		d2.imprimirDataInformada();
	}

}
