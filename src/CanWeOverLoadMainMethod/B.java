package CanWeOverLoadMainMethod;

public class B {

	public static void main(String[] args) {
		System.out.println("B main method");
		//A.main(args); // If we call again A-main it will become infinite loop
	}
}
