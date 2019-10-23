package Programs;

public class SwapStringsWithoutThridVar {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		System.out.println("Before swaping: a = "+a+" & b = "+b);
		
		// 1) Append a & b
		a = a + b; // HellowWorld
		// Store initial String a in String b
		b = a.substring(0, a.length()-b.length()); // Hello
		// Store initial String b in String a
		a = a.substring(b.length()); // World
		System.out.println("After swaping: a = "+a+" & b = "+b);
	}

}
