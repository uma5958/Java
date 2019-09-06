package ArrayListVsHashtable;

import java.util.Hashtable;

public class HashtableConcept {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		System.out.println(h.size());
		h.put(1, 100);
		h.put(2, 200);
		System.out.println(h.size());
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		h.put(3, "Tom");
		
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "Tom");
	}

}
