package orientacaoAObjeto.heranca;

public class Jogo {
	public static void main(String[] args) {
		Jogador j1 = new Jogador();
		j1.andar(Direcao.NORTE);
		System.out.println(j1.y);
		
		Jogador j2 = new Jogador();
		
		System.out.println(j1.atacar(j2));
		System.out.println(j2.vida);
				
	}
}
