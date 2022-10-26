package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		// Java não analisa valor e sim o tipo
		
		double a = 1; //conversão inplicita
		System.out.println(a);
		
		float b = (float) 1.2345467648587; //conversão Explicita (CAST)
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c;
		System.out.println(d);

	}

}
