package fundamentos;

import java.util.Date;

public class Import {
	public static void main(String [] args) {
		Date d = new Date();
		java.lang.System.out.println(d);
		
		String s = "Boa tarde";
		s = s.concat("!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.length());
		System.out.printf("Ola %s", s );
//		String a = String.format("a %s", s);
		System.out.println(s.contains("Boa"));
		System.out.println(s.indexOf("B"));
		System.out.println(s.substring(4));
		

				
	}
}
