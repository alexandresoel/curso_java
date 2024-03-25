package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		double a = 2;
		double b = a; //atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a+" "+b);
		
		Data d1 = new Data(1,6,2022);
		Data d2 = d1;
		
		d1.dia = 31;
		d2.mes = 5;
		
		d1.ano=2025;
		
		voltarParaDataFormatada(d1);
		
		System.out.println(d1.obterDataInformada());
		System.out.println(d2.obterDataInformada());
	}
	
	static void voltarParaDataFormatada(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}

}
