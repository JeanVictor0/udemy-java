package lambda;

import java.util.function.UnaryOperator;

public class UnaryAula {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		
		System.out.println(maisDois.apply(0));
		
	}
	
}
