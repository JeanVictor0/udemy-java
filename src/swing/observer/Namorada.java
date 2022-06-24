package swing.observer;

public class Namorada implements ChegadaAniversarienteObservador{
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Surpresa!!!");
	}

}
