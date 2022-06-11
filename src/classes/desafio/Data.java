package classes.desafio;

public class Data {
	byte dia;
	byte mes;
	int ano;
	
	Data(byte diaInicial,byte mesInformado,int anoInformado){
		dia = diaInicial;
		mes = mesInformado;
		ano = anoInformado;
	}
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia,mes,ano); 
	}
}
