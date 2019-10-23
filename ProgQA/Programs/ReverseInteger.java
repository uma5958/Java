package Programs;

public class ReverseInteger {

	public static void main(String[] args) {
		long num = 12345;
		
		// suing algorithm 
		long rev = 0;
		while(num != 0) {
			rev=rev*10+num%10; // To reverse number
			num=num/10; // To remove the last digit from the number
		}
		System.out.println("Reversed number is: "+rev);
		
		// Using StringBuffer
		long num1 = 123456;
		System.out.println("Reversed number is: "+new StringBuffer(String.valueOf(num1)).reverse());
	}

}
