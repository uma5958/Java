package FinalFinallyFinalize;

public class FinallyConcept {
	
	public static void main(String[] args) {
		//test1();
		//test2();
		division();
	}
	
	public static void test1() { // with exception
		try {
			System.out.println("Inside test1 method");
			throw new Exception("TestMethodException");
		} catch (Exception e) {
			System.out.println("Inside catch block");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}
	
	public static void test2() { // without exception
		try {
			System.out.println("Inside test2 method");
		} 
		finally {
			System.out.println("Finally code inside test2");
		}
	}
	
	public static void division() { // with irrelevant exception
		int i = 10;
		try {
			System.out.println("Inside try block");
			int k = i/0; // ArithmenticException
		} catch (NullPointerException e) {
			System.out.println("Inside catch block");
			System.out.println("Devide by zero error");
		}
		finally {
			System.out.println("Execute this code ever after any exception");
		}
	}
}
