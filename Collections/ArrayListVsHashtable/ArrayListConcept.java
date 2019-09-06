package ArrayListVsHashtable;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add(100); // 0
		ar.add(200); // 1
		ar.add(300); // 2
		System.out.println(ar.size());
		ar.add(400); // 3
		ar.add(500); // 4
		System.out.println(ar.size());
		ar.add("Tom"); // 5
		ar.add("Hello"); // 6
		ar.add(12.33); // 7
		ar.add('M'); // 8
		ar.add(600); // 9
		System.out.println(ar.size());
		ar.remove(9);
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		//System.out.println(ar.get(9)); // IndexOutOfBoundsException
	}

}
