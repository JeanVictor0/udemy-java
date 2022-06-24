package swing.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	private List<ChegadaAniversarienteObservador>observadores = new ArrayList<>();
	
	public void registrarObservador(ChegadaAniversarienteObservador observador) {
		this.observadores.add(observador);
	}
	
	public void monitorar() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!"sair".equalsIgnoreCase(valor)) {
			
			System.out.println("Aniversariante chegou?");
			valor = entrada.next();
		
			if ("sim".equalsIgnoreCase(valor)) {
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
				observadores.stream().forEach(o -> o.chegou(evento));
			} else {
				System.out.println("Alarme falso");
			}
		}
	}
}
