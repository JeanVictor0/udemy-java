package lambda;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = n -> n % 2 == 0 ? "Par" : "Impar";
	
		Function<Integer,String> mostrarNumero = n -> "O valor é " + n;
		System.out.println(parOuImpar.apply(1));
	}
}
