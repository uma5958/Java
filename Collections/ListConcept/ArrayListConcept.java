package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	/**
	 * Static array - size is fixed
	 * Dynamic array - ArrayList
	 * 1) Can contains duplicate values / elements 
	 * 2) Maintains insertion order
	 * 3) Synchronized 
	 * 4) Allows random access to fetch element, because it stores the values on the basis of indexes 
	 */

	public static void main(String[] args) {
		int a[] = new int[3]; // Static array - size is fixed
		
		ArrayList ar = new ArrayList();
		ar.add(10); // 0
		ar.add(20); // 1
		ar.add(30); // 2
		System.out.println(ar.size()); // size = 3
		ar.add(40); // 3
		ar.add(50); // 4
		ar.add(50); // 5
		ar.add(12.33); // 6
		ar.add("Test"); // 7
		ar.add('a'); // 8
		ar.add(true); // 9
		System.out.println(ar.size()); // size = 10
		System.out.println(ar.get(5)); // To get the values from an index
		
		// To print all values from arraylist
		// 1) for loop
		// 2) using iterator
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("*********");
		
		// Non-Generics vs Generics
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		// ar1.add("Selenium"); // Not allowed
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Test");
		ar2.add("Selenium");
		
		//ArrayList<E> ar3 = new ArrayList<E>();
		
		// Employee class objects - User defined class object ArrayList
		Employee e1 = new Employee("Naveen", 27, "QA");
		Employee e2 = new Employee("Tom", 28, "Dev");
		Employee e3 = new Employee("Peter", 29, "Admin");
		
		// Create arraylist
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		// Iterator to travese the values 
		Iterator<Employee> itr = ar4.iterator();
		while(itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("*********");
		
		// addAll()
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Test");
		ar5.add("Selenium");
		ar5.add("QTP");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Dev");
		ar6.add("Java");
		ar6.add("JavaScript");
		
		ar5.addAll(ar6);
		
		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("*********");
		
		// removeAll()
		ar5.removeAll(ar6);
		
		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("*********");
		
		// retainAll() - common elements
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Test");
		ar7.add("Java");
		ar7.add("JavaScript");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Test");
		ar8.add("Selenium");
		ar8.add("QTP");
		
		ar7.retainAll(ar8);
		
		for (int i = 0; i < ar7.size(); i++) {
			System.out.println(ar7.get(i));
		}
		
	}

}
