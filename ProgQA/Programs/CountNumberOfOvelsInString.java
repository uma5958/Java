package Programs;

public class CountNumberOfOvelsInString {

	public static void main(String[] args) {
		String str = "i am learning java";
		// Method 1
		System.out.println("Ovels count using lenght method");
		int count = str.length() - str.replaceAll("[aeiou]", "").length();
		System.out.println("1) Totals ovels count: "+count);
		
		// Method 2
		System.out.println("Ovels count using for loop and char array");
		char[] arr = str.toCharArray();
		int count1 = 0;
		for (char c : arr) {
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				count1++;
			}
		}
		System.out.println("2) Total ovels count: "+count1);
		
		// individual Ovels count
		System.out.println("Individul ovels count: Using length method");
		System.out.println("'a' count: "+(str.length() - str.replaceAll("a", "").length()));
		System.out.println("'e' count: "+(str.length() - str.replaceAll("e", "").length()));
		System.out.println("'i' count: "+(str.length() - str.replaceAll("i", "").length()));
		System.out.println("'o' count: "+(str.length() - str.replaceAll("o", "").length()));
		System.out.println("'u' count: "+(str.length() - str.replaceAll("u", "").length()));
		
		// Method 3
		System.out.println("Individul ovels count: Using if-else");
		int aCount=0;
		int eCount=0;
		int iCount=0;
		int oCount=0;
		int uCount=0;
		for (char c : arr) {
			if (c=='a') {
				aCount++;
			} else if(c=='e') {
				eCount++;
			} else if (c=='i') {
				iCount++;
			} else if(c=='o') {
				oCount++;
			} else if (c=='u') {
				uCount++;
			} 
		}
		
		System.out.println("'a' count: "+aCount);
		System.out.println("'e' count: "+eCount);
		System.out.println("'i' count: "+iCount);
		System.out.println("'o' count: "+oCount);
		System.out.println("'u' count: "+uCount);
	}

}
