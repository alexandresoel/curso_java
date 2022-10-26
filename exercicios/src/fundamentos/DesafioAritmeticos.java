package fundamentos;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		//
		//
		
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 2);
		
		System.out.println(b);
		
		int x = (int)  Math.pow(6 * (3+2),2);
		int y = x / (3 * 2);
		
		System.out.println(y);
		
		int z =  (int) Math.pow(((1 - 5)*(2 - 7))/2,2);
		System.out.println(z);
		
		int w = (int) Math.pow((y - z),3)/ (int) Math.pow(10, 3);
		System.out.println(w);
		
		
		

	}

}
