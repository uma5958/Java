package Programs;

public class ReverseEachWord {

	public static void main(String[] args) {
		// Reverse each word and same order of string
		String  str  = "How are you"; // expected: woH era uoy
		String[] arr = str.split(" ");
		String result = "";
		for (int i = 0; i < arr.length ; i++) {
			String reverseWord = "";
			char[] arr1 = arr[i].toCharArray();
			for (int j = arr1.length-1; j >= 0; j--) {
				reverseWord = reverseWord+arr1[j];
			}
			result = result+reverseWord+" ";
		}
		System.out.println(result);

		// Reverse each word and whole string also
		String str1 = "How are you"; // expected: uoy era woH 
		String[] arr2 = str1.split(" ");
		String result2 = "";
		for (int i = arr2.length-1; i >= 0; i--) {
			String reverseWord2 = "";
			char[] arr4 = arr2[i].toCharArray();
			for (int j = arr4.length-1; j >= 0; j--) {
				reverseWord2 = reverseWord2+arr4[j];
			}
			result2 = result2+reverseWord2+" ";
		}
		System.out.println(result2);
	}

}
