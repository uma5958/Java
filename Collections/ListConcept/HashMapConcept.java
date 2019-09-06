package ListConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {
	/**
	 * -> HashMap is a class implements Map Interface 
	 * -> extends AbstractMap
	 * -> It contains only unique elements 
	 * -> Store the values - key & value pair
	 * -> It may have one null key and multiple null values 
	 * -> It maintains no order
	 * -> HashMap is non-synchronized - not thread safe 
	 * -> Concurrent modification exception: fast-fail condition
	 */
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "Test Complete");
		hm.put(4, "RFT");

		System.out.println(hm.get(1)); // Selenium
		System.out.println(hm.get(4)); // RFT

		for ( Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

		System.out.println(hm); // {1=Selenium, 2=QTP, 3=Test Complete, 4=RFT}
		hm.remove(3);
		System.out.println(hm); // {1=Selenium, 2=QTP, 4=RFT}

		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		Employee e1 = new Employee("Tom", 25, "Admin");
		Employee e2 = new Employee("Peter", 26, "QA");
		Employee e3 = new Employee("Stev", 27, "Dev");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		// Traverse the HashMap 
		for ( Entry<Integer, Employee> m : emp.entrySet()) {
			Integer key = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee "+key+" info");
			System.out.println(e.name+" "+e.age+" "+e.dept);
		}
	}

}
