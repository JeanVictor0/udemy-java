package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		BinaryOperator<Double> media = (Double n1 , Double n2) -> (n1 + n2) /2 ;
	
		BiFunction<Double, Double, String> resultado = (n1,n2) -> {
			double notaFinal = (n1 + n2) /2;
			return notaFinal  >= 7 ? "Aprovado":"Reprovado";
		};
		
		Function<Double, String> conceito = m -> "Foda";
	}
	
}
