package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
//		 int id = 56789;
		long pontosAcumulados = 3_321_412_312L;
		
		float salario = 11_341.23F;
		double vendasAcumuladas = 2_231_341_321_321.01;
		
		
		String status = "A";
		
		System.out.println(anosDeEmpresa * 365);
		
		System.out.println(numerosDeVoos / 2 );
		
		System.out.println(pontosAcumulados / vendasAcumuladas );
		
		System.out.println("Salario -> " + salario);
		System.out.println("Ferias?\n " + status);
		
		String s = "Bom dia x!";
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.replace("X", "SENHORA");
		
		System.out.println(s);
		
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Oiiii".toUpperCase());
		
		
	}
}
