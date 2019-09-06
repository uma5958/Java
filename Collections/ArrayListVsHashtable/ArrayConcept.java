package ArrayListVsHashtable;

public class ArrayConcept {
	/**:
	 * Disadvantages of array:
	 * 1) Size is fixed: 
	 * 		- static array: to overcome this problem we use collections
	 * 		- dynamic array: ArrayList
	 * 2) It stores similar data type: To overcome this problem we use Object array
	 */
	public static void main(String[] args) {
		// int Array
		int i[] = new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;		
		i[3]=40;
		//i[4]=50; // ArrayIndexOutOfBoundsException
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		// size of array
		System.out.println(i.length);
		
		// to print all values of array we use for loop
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
	}

}
