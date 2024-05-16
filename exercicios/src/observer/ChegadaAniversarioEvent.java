package observer;

import java.util.Date;

public class ChegadaAniversarioEvent {
	
	private final Date horaDaChegada;

	public ChegadaAniversarioEvent(Date horaDaChegada) {
		super();
		this.horaDaChegada = horaDaChegada;
	}

	public Date getHoraDaChegada() {
		return horaDaChegada;
	}
	
	

}
