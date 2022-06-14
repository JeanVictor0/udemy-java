package arrayAndCollections;

import java.util.Arrays;

public class AttaysAndCollections {
	public static void main(String[] args) {
		double[] notaAlunoA = new double[3];
		
		String b = Arrays.toString(notaAlunoA);
		
		System.out.println(b);
		
		notaAlunoA[0] = 12;
		notaAlunoA[1] = 12;
		notaAlunoA[2] = 12;
		
		String a = Arrays.toString(notaAlunoA);
		
		System.out.println(a);
		
	}	
}
