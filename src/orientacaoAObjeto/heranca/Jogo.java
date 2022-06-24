package orientacaoAObjeto.heranca;

public class Jogo {
	public static void main(String[] args) {
		Jogador j1 = new Jogador(0,0);
		j1.andar(Direcao.NORTE);
		System.out.println(j1.y);
		
		Jogador j2 = new Jogador(0,0);
		
		System.out.println(j1.atacar(j2));
		System.out.println(j2.vida);
				
	}
}
