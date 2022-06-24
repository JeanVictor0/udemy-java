package orientacaoAObjeto.heranca;

public class Jogador {
	int vida = 100;
	int x;
	int y;
	
	Jogador(){
		this(0,0);
	}
	Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	boolean andar;
	
	public boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean andar(Direcao direcao){
		
		switch (direcao) {
		case NORTE:
			y++;
			break;
		case SUL:
			x++;
			break;
		
		default:
			System.out.println("Nao reconhecido");
		}
//		if(direcao == direcao.NORTE) {
//			y++;
//		} else if (direcao == direcao.SUL) {
//			x++;
//		}
//		int x = 0;
		return true;
	}
}
