package JavaBasics;

public class DataTypes {
	// Hi this is Single line comment
	/**
	 * Hi this
	 * is multi line
	 * comment
	 */
	/*Hi This is
	multi line comment*/

	public static void main(String[] args) {
		// Primitive data types: int, char, double, boolean 
		// 1. int:
		int i=10;
		i=20;
		int j=30;
		System.out.println(j); // short cut: syso -> ctrl+space
		int k=40;
		int l=-1;
		System.out.println(i+j);
		
		// 2. double:
		double d=12.33;
		double d1=34.14;
		System.out.println(d1);
		double d2=100; //100.0
		System.out.println(d2);
		
		// 3. char: only single digit value, should be written in within single quotes 
		char c='a';
		char c1='A';
		char c2='1';
		char c3='$';
		
		// 4. boolean
		boolean b1=true;
		boolean b2=false;
		
		// 5. String: is a class, not a data type
		String s="Hello world";
		String s1="Selenium";
		String s2="Hi this is my java code";
		String s3="1000";
		String s4="12.33";
		System.out.println(s2);
	}
}
