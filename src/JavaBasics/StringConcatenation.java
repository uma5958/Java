package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		/**
		 * + is concatenation operator
		 * print - is used to print on the console
		 * println - used to print on the console with a new line
		 */
		int a=100;
		int b=200;
		String x="Hello";
		String y="world";
		double c=12.33;
		double d=10.33;
		System.out.println(a+b); // 300
		System.out.println(x+y); // Hello world
		System.out.println(a+b+x+y); // 300Helloworld
		System.out.println(x+y+a+b); // Hellowworld100200
		System.out.println(x+y+(a+b)); // Helloworld300
		System.out.println(a+b+x+y+a+x+b+y); // 300Helloworld100Hello200world
		System.out.println(a+b+x+y+a+b); // 300Helloworld100200
		System.out.println(c+d); // 22.66
		System.out.println(x+y+c+d); // Helloworld12.3310.33
		System.out.println("Hellow world"); // Hello world
		System.out.println(a); // 100
		System.out.println("The value of a is: "+a); // The value of a is: 100
		System.out.println("The addition of a & b is: "+(a+b)); // The value of a & b is: 300
		System.out.print("Hello selenium"); // Hello selenium Hello testing 
		System.out.println("Hello testing ");  
	}
}
