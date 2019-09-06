package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		// add()
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		// print
		System.out.println("Contents of LinkedList: "+ll); // Contents of LinkedList: [Test, QTP, Selenium, RPA, RFT]
		
		// addFirst()
		ll.addFirst("Naveen");
		
		// addLast()
		ll.addLast("Automation");
		
		System.out.println("Contents of LinkedList: "+ll); // Contents of LinkedList: [Naveen, Test, QTP, Selenium, RPA, RFT, Automation]
		
		// get()
		System.out.println(ll.get(0));
		
		// set()
		ll.set(0, "Tom");
		
		System.out.println(ll.get(0));
		
		// Remove first & last elements
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("Contents of LinkedList: "+ll); // Contents of LinkedList: [Test, QTP, Selenium, RPA, RFT]
		
		ll.remove(2); // removes element at 2 index
		System.out.println("Contents of LinkedList: "+ll); // Contents of LinkedList: [Test, QTP, RPA, RFT]
		
		// How to print all values from LinkedList
		// for loop
		System.out.println("*** for loop ***");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		// iterator
		System.out.println("*** iterator ***");
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// while loop
		System.out.println("*** while loop ***");
		int n = 0;
		while(ll.size() > n) {
			System.out.println(ll.get(n));
			n++;
		}
		
	}

}
