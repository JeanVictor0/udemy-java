package lambda;

import java.util.function.BinaryOperator;

public class Calculo {
	public static void main(String[] args) {
		
		
		
		
		BinaryOperator<Double> calc = (x,y) -> {return x + y;};
		System.out.println(calc.apply(12.3, 31.3));
	}
}
