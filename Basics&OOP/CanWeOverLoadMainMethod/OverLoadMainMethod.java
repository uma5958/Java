package CanWeOverLoadMainMethod;

public class OverLoadMainMethod {
	
	/**
	 * -> JVM first looks for the signature "public static void" and with
	 *    "String[] args" or "String args[]" arguments
	 * -> If we comment the main method we can't get the option to execute
	 *    i.e "Run-As" Java Application
	 */
	
	// JVM -- main(String args[]) -- public static void 
	public static void main(String[] args) {
		System.out.println("Main method 1");
		main("Testing");
		main(10);
		main(10, 20);
	}
	
	public static void main(String args) {
		System.out.println("Main method 2");
	}
	
	public static void main(int a) {
		System.out.println("Main method 3");
	}
	
	public static void main(int a, int b) {
		System.out.println("Main method 4");
	}

}
