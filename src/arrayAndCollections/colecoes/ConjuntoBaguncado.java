package arrayAndCollections.colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjuntos = new HashSet();
		conjuntos.add("Teste");
		
		System.out.println(conjuntos.size());

		System.out.println(conjuntos.remove("Teste"));
		
		System.out.println(conjuntos.size());
		
		System.out.println(conjuntos.contains(2));
	
		Set<String> nums = new HashSet<>();
		
		System.out.println(conjuntos);
		
		nums.add("Oi");
		
		conjuntos.addAll(nums);
		
		System.out.println(conjuntos);
		
//		for (String bagunca: conjuntos ) {
//			System.out.println(bagunca);
//		}
		
		Set ordem = new TreeSet<>();
		
		ordem.add(1);
		ordem.add(2);
		ordem.add(3);
		
		System.out.println(ordem);
		
		
		
	}
}
