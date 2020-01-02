package StarPatternPrograms;

public class A {

	public static void main(String[] args) {
		String str = "i am learning java";
		
		int count = str.length() - str.replaceAll("[aeiou]", "").length();
		System.out.println("1) Totals ovels count: "+count);
		
		char[] arr = str.toCharArray();
		int count1 = 0;
		for (char c : arr) {
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				count1++;
			}
		}
		System.out.println("2) Total ovels count: "+count1);
		
	}

}
