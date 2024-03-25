package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10, 11);
		
		System.out.println("Monstro tem => "+ monstro.vida);
		System.out.println("Heroi tem => "+ heroi.vida);

		monstro.ataca(heroi);
		heroi.ataca(monstro);
		
		monstro.ataca(heroi);
		heroi.ataca(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.ataca(heroi);
		heroi.ataca(monstro);
		
		System.out.println("Monstro tem => "+ monstro.vida);
		System.out.println("Heroi tem => "+ heroi.vida);
		
		
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.NORTE);
		
		

	}

}
