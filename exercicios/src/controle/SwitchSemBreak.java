package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "preta";
		switch (faixa.toLowerCase()) {
		case "preta": 
			System.out.println("Sei o Bassai-Dai...");
		case "marrom": 
			System.out.println("Sei o Tekki-Shodan");
		case "roxa": 
			System.out.println("Sei o Heian godan");
		case "verde": 
			System.out.println("Sei o Heian yodan");
		case "laranja": 
			System.out.println("Sei o Heian sadan");
		case "vermelha": 
			System.out.println("Sei o Heian nidan");


	}
}
}