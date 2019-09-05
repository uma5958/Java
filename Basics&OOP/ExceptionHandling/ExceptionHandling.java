package ExceptionHandling;

public class ExceptionHandling {
	/**
	 * -> Exception occurred is printed at catch block and remaining statement will be executed 
	 * 	  after catch block even the exception occurred
	 * -> Instead of ArithmeticException if we use 'Exception' it will take care of any exception 
	 */
	
	int a = 10;
	static ExceptionHandling obj;
	
	public static void main(String[] args) {
		// uncaught exception: 
		//int i = 9/0;
		//System.out.println(i);
		
		// Caught exception:
		//Thread.sleep(2000);
		 
		// 1) try-catch block
		try {
			int i = 9/0; // This code will through an exception
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("This is / zero error");
		}
		System.out.println("ABC");
		System.out.println("ABC");
	}
}
