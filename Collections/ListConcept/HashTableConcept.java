package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {
	/**
	 * -> It is similar to HashMap, but it is synchronized 
	 * -> Stores the values on the basis of key & value
	 * -> key - Object HashCode & value
	 * -> no null key and null values 
	 */

	public static void main(String[] args) {
		
		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Java");
		
		// Create a clone - copy/shallow copy
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable)h1.clone();
		
		System.out.println("Values from h1: "+h1);
		System.out.println("values from h2: "+h2);
		
		h1.clear();
		
		System.out.println("Values from h1: "+h1);
		System.out.println("values from h2: "+h2);
		
		// Contains value
		Hashtable st = new Hashtable();
		st.put("A", "Naveen");
		st.put("B", "Manager");
		st.put("C", "Selenium");
		
		if (st.containsValue("Naveen")) {
			System.out.println("Value found");
		}
		
		// Print all values form HashTable using - Enumeration - elements 
		Enumeration e = st.elements();
		System.out.println("Print all values from st using enumeration");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		// get all values from hashtable using - entrySet - set of hashtable values 
		System.out.println("Print all values from st using entrySet");
		Set s = st.entrySet();
		System.out.println(s); // [A=Naveen, C=Selenium, B=Manager]
		
		Hashtable st1 = new Hashtable();
		st1.put("A", "Naveen");
		st1.put("B", "Manager");
		st1.put("C", "Selenium");
		st1.put("C", "Selenium"); // It contains only unique values 
		// no null key and null values 
		// st1.put("D", null); // NullPointerException
		
		System.out.println("values from st1: ");
		System.out.println(st1);
		
		// Check both the hashtables are equal or not
		if(st.equals(st1)) {
			System.out.println("Both are equal");
		}
		
		// get the values form the key
		System.out.println(st1.get("A"));
		
		// get the hashcode of hashtabel object
		System.out.println("Hash code value of st1: "+st1.hashCode());
		
		// Generics
		Hashtable<String, String> st3 = new Hashtable<String, String>();
		
	}

}
