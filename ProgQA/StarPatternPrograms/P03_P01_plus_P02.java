package StarPatternPrograms;

import java.util.Scanner;

public class P03_P01_plus_P02 {
	/*

	 *
	 **
	 ***
	 ****
	 *****
	 ****
	 ***
	 **
	 *

	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = n-1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}


		sc.close();
	}

}
