package fundamentos;

public class ConversaoTiposPrimitivos {
	public static void main(String[] args) {
		
		double a = 1;
		float b = 1.0F;
		System.out.println(b);
		
		int c = 127;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f);
	}
	
}
