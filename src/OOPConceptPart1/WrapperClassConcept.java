package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {

		// Integer, Double, Boolean 
		String x = "100";
		System.out.println(x+20);

		// String to double conversion
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d);

		// String to boolean 
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b); // true
		
		// Int to String conversion 
		int j = 200;
		System.out.println(j+200);
		
		String s = String.valueOf(j); // "200"
		System.out.println(s);
		System.out.println(s+20); // 200200
		
		String u = "100A";
		Integer.parseInt(u); // NumberFormatException - for input string: "100A"
	}

}
