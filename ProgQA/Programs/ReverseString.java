package Programs;

public class ReverseString {
	/**
	 * -> Differences between String & StringBuffer: String - immutable & StringBuffer - mutable
	 * -> Do we have Reverse function in String ? No
	 */
	public static void main(String[] args) {
		String s = "Selenium";
		
		// Using for loop 
		String rev  = "";
		for (int i = s.length()-1; i >= 0; i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println("Reversed string is: "+rev);
		
		// Using StringBuffer
		StringBuffer sb = new StringBuffer(s);
		System.out.println("Reversed string is: "+sb.reverse());
	}

}
