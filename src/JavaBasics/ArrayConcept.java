package JavaBasics;

public class ArrayConcept {
	public static void main(String[] args) {
		/**
		 * Array: To store similar data type values in a array variable
		 * lowest bound/index = 0
		 * upper bound/index = n-1 (n is size of array)
		 * one-dimensional array
		 * Disadvantages of array:
		 * 1. Size is fixed - static array - to overcome this problem, we use collections
		 * - Array list, Hash Table - use dynamic array
		 * 2. Stores only similar data types - to overcome this problem, we use object array 
		 */
		
		// 1. int array
		int i[] = new int[4]; // int []i = new int[4]; - same 
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]); // 20
		System.out.println(i[3]); // 40
		//System.out.println(i[4]); // ArrayIndexOutOfBoundsException
		System.out.println("Size of array is: "+i.length); // size or length of array // 4
		// print all values of array use for loop
		for(int j=0; j<i.length; j++) {
			System.out.println(i[j]);
		}
		
		// 2. double array
		double d[] = new double[3];
		d[0]=12.33;
		d[1]=13.44;
		d[2]=45.55;
		System.out.println(d[2]); // 45.55
		
		// 3. char array
		char c[] = new char[3];
		c[0]='q';
		c[1]=2;
		c[2]='$';
		System.out.println(c[2]); // $
		
		// 4. boolean array
		boolean b[] = new boolean[2]; 
		b[0]=true;
		b[1]=false;
		System.out.println(b[0]); // true
		
		// 5. String array
		String s[] = new String[3];
		s[0]="Test";
		s[1]="Hello";
		s[2]="World";
		System.out.println(s.length); // 3
		System.out.println(s[1]); // Hello
		
		// 6. Object array: (Object is a class) - is used to store different data type values 
		Object obj[] = new Object[6];
		obj[0]="Tom";
		obj[1]=25;
		obj[2]=12.33;
		obj[3]="1/1/1990";
		obj[4]='M';
		obj[5]="London";
		System.out.println(obj[5]); // London
		System.out.println(obj.length); // 6
	}
}
