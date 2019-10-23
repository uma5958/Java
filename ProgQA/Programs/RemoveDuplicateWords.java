package Programs;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String str = "I am am rahul rahul";
		System.out.println("Before removing duplicates: "+str);
		String[] arr = str.split(" ");
		//Set<String> set = new HashSet<String>(); // HashSet not allows duplicates & will NOT maintains the order
		Set<String> set = new LinkedHashSet<String>(); // LinkedHashSet not allows duplicates & maintains order
		for (String x : arr) {
			set.add(x);
		}
		System.out.print("After removing duplicates: ");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
