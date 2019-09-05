package WhyStringIsImmutableAndFinal;

public class StringConcept {

	public static void main(String[] args) {
		String s1 = "Java"; // id = 15
		String s2 = "Java"; // id = 15 -> new id = 23 (after changing s2)
			   s2 = "Naveen";
		String s3 = "Selenium";
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
