package Programs;

public class StringManipulationInJava {

	public static void main(String[] args) {
		String str = "The rains have started here";
		String str1 = "The rains Have started here";
		
		System.out.println(str.length()); // 27
		System.out.println(str.charAt(5)); // a
		System.out.println(str.indexOf('s')); // 1st occurrence of 's' = 8
		System.out.println(str.indexOf('s', str.indexOf('s')+1)); // 2nd occurrence of 's' = 15
		System.out.println(str.indexOf("have")); // 10
		System.out.println(str.indexOf("Hello")); // If the given string isnot available it returns: -1
		// String comparison 
		System.out.println(str.equals(str1)); // false
		System.out.println(str.equalsIgnoreCase(str1)); // true
		// SubString
		System.out.println(str.substring(0, 9)); // The rains - Begin index includes and end index excludes
		// Trim
		String s = "   Hello   ";
		System.out.println(s.trim()); // Hello
		System.out.println(s.replace(" ", "")); // Hello
		String date = "01-01-2017";
		System.out.println(date.replace("-", "/")); // 01/01/2017
		// Split
		String test = "Hello_world_test_selenium";
		String testVal[] = test.split("_");
		for (int i = 0; i < testVal.length; i++) {
			System.out.println(testVal[i]);
		}
		String s2 = "Cares";
		System.out.println(s2.concat("s")); // Caress
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		System.out.println(x+y); // HelloWorld
		System.out.println(a+b); // 300
		System.out.println(x+y+a+b); // HelloWorld100200
		System.out.println(a+b+x+y); // 300HellowWorld
		System.out.println(x+y+(a+b)); // HelloWorld300
	}    

}
