package lambda;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isThreNumbers = num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.test(22));
		
		System.out.println(isPar.and(isThreNumbers).negate().test(124));
		
	}
}
