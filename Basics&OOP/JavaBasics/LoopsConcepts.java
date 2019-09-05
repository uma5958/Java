package JavaBasics;

public class LoopsConcepts {

	public static void main(String[] args) {
		/**
		 * 1. While loop:
		 * Disadvantage of while loop is it will generates infinite loop 
		 * if we don't give incremental & decremental part 
		 */
		// Print 1 to 100
		int i=1; // initialization
		while(i<=10) { // condition
			System.out.println(i);
			i=i+1; // increment or decrement
		}
		System.out.println("****************");
		// j++ means j=j+1
		// 2. for loop
		// print 1 to 10
		for(int j=1; j<=10; j++) { // initialization, condition, updation
			System.out.println(j);
		}
		System.out.println("****************");
		// -1>-10 true
		// 1>10 false
		// print 10 to 1
		// k-- means k=k-1
		// 10 9 8 7 6 5 4 3 2 1
		for (int k = 10; k >= 1; k--) {
			System.out.println(k);
		}
	}
}
