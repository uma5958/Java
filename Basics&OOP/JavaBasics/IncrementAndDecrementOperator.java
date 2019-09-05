package JavaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		// ++
		// --
		int i=1;
		int j=i++; // post increment
		System.out.println(i); // 2
		System.out.println(j); // 1
		
		int a=1;
		int b=++a; // preincrement
		System.out.println(a); // 2
		System.out.println(b); // 2
		
		int m=2;
		int n=m--; // postdecrement
		System.out.println(m); // 1
		System.out.println(n); // 2
		
		int p=2;
		int q=--p; // predecrement
		System.out.println(p); // 1
		System.out.println(q); // 1
	}

}
