package Programs;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		primeChecker(n);
	}
	
	public static void primeChecker(int num) {
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(num%i == 0) {
				count++;
			}
		}
		
		if (count == 2) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a prime numeber");
		}
	}
	
}


