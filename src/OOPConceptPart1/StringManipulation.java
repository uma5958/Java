package OOPConceptPart1;

public class StringManipulation {

	public static void main(String[] args) {
		String s = "The rains have started here selenium";
		
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(26));
		//System.out.println(s.charAt(37)); // StringIndexOutOfBoundsException
		
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('s')); // 8 -> first occurrence of s
		System.out.println(s.indexOf('s', s.indexOf('s')+1)); // 15 -> 2nd occurrence of s
		System.out.println(s.indexOf('s', s.indexOf('s', s.indexOf('s')+1)+1)); // 15 -> 3rd occurrence of s
		
		System.out.println(s.indexOf("have")); // returns starting index of string 
		System.out.println(s.indexOf("hello")); // -1
		
		String s1 = "The rains have started here";
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		
		// Trim
		String str = "	Hello world	";
		System.out.println(str);
		System.out.println(str.trim());
		
		// Replace 
		String date = "01-01-2018";
		System.out.println(date.replace('-',  '/'));
		
		String s2 = "Hello world";
		System.out.println(s2.replace(" ", ""));
		
		// SubString
		String s3 = "The trains have started here";
		System.out.println(s3.substring(0, 9));
		
		// Split 
		String s4 = "Hello_selenium_testing";
		String[] arr = s4.split("_");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		String h = "XxTestXxTestXxTesting";
		String[] d = h.split("Xx");
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		
		String firstName = "Tom;Naveen;Felix;Ipsi;Sharmi";
		String[] fn = firstName.split(";");
		for (int i = 0; i < fn.length; i++) {
			System.out.println(fn[i]);
		}
		
		
	}

}
