package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		int a=30;
		int b=20;
		if(b>a) {
			System.out.println("b is greater than a");
		} else {
			System.out.println("a is grater than b");
		}
		// Comparison operators: < > <= >= == !=
		int c=40;
		int d=50;
		if (c==d) {
			System.out.println("c and d are equals");
		} else {
			System.out.println("c and d are not equal");
		}
		// write a logic to find the highest number
		// Nested if-else
		int a1=400;
		int b1=500;
		int c1=300;
		if (a1>b1 && a1>c1) {
			System.out.println("a1 is greatest");
		} else if (b1>c1) {
			System.out.println("b1 is greatest");
		} else {
			System.out.println("c1 is greatest");
		}
	}
}
