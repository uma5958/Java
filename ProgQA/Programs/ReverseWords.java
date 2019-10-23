package Programs;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "I am working on my pc"; // Expected: pc my on working am I 
		String[] arr = str.split(" "); // can use str.split("\s")
		String result = "";
		for (int i = arr.length-1; i >= 0; i--) {
			result = result+arr[i]+" ";
		}
		System.out.println(result);
	}

}
