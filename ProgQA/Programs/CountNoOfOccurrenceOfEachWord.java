package Programs;

import java.util.HashMap;
import java.util.Map;

public class CountNoOfOccurrenceOfEachWord {

	public static void main(String[] args) {
		String str = "I am learning learning java java programming";
		Map<String, Integer> map = new HashMap<String, Integer>();
		String arr[] = str.split(" ");
		int count = 1;
		for(int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		// Printing values from Map
		for (String x : map.keySet()) {
			System.out.println("The occurrence of the word: "+x+" = "+map.get(x));
		}
		
	}

}

