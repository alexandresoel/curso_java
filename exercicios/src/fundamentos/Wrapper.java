package fundamentos;


public class Wrapper {

	public static void main(String[] args) {
		Byte b = 100;
		Short s = 1000;	
		Integer i = 10000; //int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c);
		
		Float f = 123.45f;
		Double d = 1234.2345;
		System.out.println(f);
		System.out.println(d);
		
		
		
		
	}

}
