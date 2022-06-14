package classes.desafio;

public class Data {
	byte dia;
	byte mes;
	int ano;
	
	public Data(byte dia,byte mes,int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	public String obterDataFormatada() {
		return String.format("%d/%d/%d", dia,mes,ano); 
	}
}
