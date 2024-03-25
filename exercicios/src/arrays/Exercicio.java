package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0]= 6.2;
		notasAlunoA[1]= 7.4;
		notasAlunoA[2]= 9.1;
		notasAlunoA[3]= 9.7;
		double total = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		System.out.println(total/notasAlunoA.length);
		
		System.out.println(Arrays.toString(notasAlunoA));
	}

}
