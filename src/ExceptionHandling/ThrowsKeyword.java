package ExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args) {
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("ABC");
	}
	
	public void sum() {
		try {
			div();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
	
	public void div() throws ArithmeticException{
		int i = 9/0; // Exception line
	}
}

/**
 * Note:
 * Exception flow: Occurred at div() and it is thrown to sum() to handle
 */

