package observer;

public class Namorada implements ChegadaAniversarianteObserver{

	@Override
	public void chegou(ChegadaAniversarioEvent event) {
		System.out.println("Apagar as luzes...");
		System.out.println("Fazer silencio...");
		System.out.println("Surpresa!!");
		
	}
	

}
