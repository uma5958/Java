package Programs;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		int n = 5;
		int fact = factorialFinder(n);
		System.out.println("Factorial of "+n+" is: "+fact);
	}

	public static int factorialFinder(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n*factorialFinder(n-1);
		}
	}

}
