package Programs;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		String s = "Selenium";
		String reverseString = reverseString(s);
		System.out.println("Reversed stringis: "+reverseString);
	}
	
	public static String reverseString(String s) {
		if (s.isEmpty()) {
			return s;
		}
		// calling function recursively 
		return reverseString(s.substring(1))+s.charAt(0);
	}

}
