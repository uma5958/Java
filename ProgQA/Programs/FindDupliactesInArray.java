package Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDupliactesInArray {

	public static void main(String[] args) {
		int[] arr = {2, 5, 6, 7, 6, 8, 2, 9};
		System.out.println("Bruteforce method:");
		findDuplicatesUsingBruteForce(arr);
		System.out.println("Using sorting:");
		findDuplicatesUsingSorting(arr);
		System.out.println("Using HashSet:");
		findDuplicatesUsingSet(arr);
		System.out.println("Using HashMap:");
		findDuplicatesUsingHashMap(arr);
	}
	
	public static void findDuplicatesUsingBruteForce(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Dupliacate element is: "+arr[i]);
				}
			}
		}
	}
	
	public static void findDuplicatesUsingSorting(int[] arr) {
		Arrays.sort(arr); // {2, 2, 5, 6, 6, 7, 8, 9}
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == arr[i+1]) {
				System.out.println("Duplicate element is: "+arr[i]);
			}
		}
	}
	
	public static void findDuplicatesUsingSet(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for (int x : arr) {
			if (!set.add(x)) {
				System.out.println("Duplicate element is: "+x);
			}
		}
	}
	
	public static void findDuplicatesUsingHashMap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 1;
		for (int x : arr) {
			if (!map.containsKey(x)) {
				map.put(x, count);
			} else {
				map.put(x, map.get(x)+1);
			}
		}
		for (int key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println("Duplicate element is: "+key);
			}
		}
		
	}

}
