package lambda;

@FunctionalInterface
public interface CalculoInterface {
	String fala(String a);
	
	default void legal() {
		
	};
}
