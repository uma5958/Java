package StarPatternPrograms;

import java.util.Scanner;

public class P02_Left_reverse_triangle {
	/*

	 *
	 **
	 ***
	 ****
	 *****

	 */

	// i = rows & j = columns
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

}
