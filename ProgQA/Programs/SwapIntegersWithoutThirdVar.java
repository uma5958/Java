package Programs;

public class SwapIntegersWithoutThirdVar {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
		// 1) with third variable 
		int t;
		t = x; // 5
		x = y; // 10
		y = t; // 5
		System.out.println("With third variable");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		
		// without using 3rd var: using + operator
		x = x + y; // 5+10 = 15
		y = x - y; // 15-10 = 5
		x = x - y; // 15-5 = 10
		System.out.println("With + operator");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		
		// without using 3rd var: using * operator
		x = x * y; // 5*10 = 50
		y = x / y; // 50/10 = 5
		x = x / y; // 50/5 = 10
		System.out.println("With * operator");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		// without using 3rd var: using XOR: ^
		x = x ^ y; // 15 -> 1111
		y = x ^ y; // 5 -> 0101
		x = x ^ y; // 10 -> 1010
		System.out.println("With ^ operator");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}

}
