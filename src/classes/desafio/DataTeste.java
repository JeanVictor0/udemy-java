package classes.desafio;

public class DataTeste {
	public static void main(String[] args) {
		Data data = new Data();
		
		data.dia = 1;
		data.mes = 4;
		data.ano = 2043;
		
		System.out.printf(data.obterDataFormatada());
	}
}
