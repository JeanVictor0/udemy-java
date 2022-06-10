package fundamentos.estruturaDeControle;

public class Switch {

	public static void main(String[] args) {
		
		int i = 1;
		switch (i) {
		case 1:
			System.out.println("Ta certo");
		case 2: case 4:
			System.out.println("PARA");
			break;
		default:
			System.out.println("Nao sei");
		}
	}
}
