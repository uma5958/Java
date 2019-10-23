package Programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		String names[] = {"Java", "JavaScript", "Ruby", "C", "Python", "Java"};
		
		// 1) Compare each element: 0(nxn) - wrost solution
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicate element is: "+names[i]);
				}
			}
		}
		
		System.out.println("*****************");
		
		// 2 Using HashSet: It stores unique values: o(n)
		Set<String> s = new HashSet<String>();
		for (String name : names) {
			if (s.add(name) == false) {
				System.out.println("Duplicate element is: "+name);
			}
		}
		
		System.out.println("******************");
		
		// 3 Using HashMap: o(2n)
		Map<String, Integer> m = new HashMap<String, Integer>();
		for (String name : names) {
			Integer count = m.get(name);
			if (count == null) {
				m.put(name, 1); // 1 - no.of occurrence in map
			} else {
				m.put(name, ++count);
				System.out.println("Duplicate element is: "+name);
			}
		}
		
		
	}

}
