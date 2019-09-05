package PatternProg;

import java.util.Scanner;

public class Patterns {
	  
	public static void main(String args[]){    
		//pattern();
		//diamond();
		//hallowDiamond();
		//leftHalfDiamond();
		rightHalfDiamond();
	}  

	static void pattern() {
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = sc.nextInt();
		System.out.println("Enter Symbol: ");
		char c = sc.next().charAt(0);
		
		for (int i = 0; i <= n; i++) {
			for (int j = i+1; j <= 5; j++) {
				System.out.print(" "+c+" ");
			}
			System.out.println();
		}
	}

	static void diamond() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=sc.nextInt(); 
		System.out.print("Enter Symbol : ");

		char c = sc.next().charAt(0);

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print("   ");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print(" "+c+" ");
			}
			System.out.println();

		} 
		// Repeat again in reverse order
		for(int i=n-1;i>0;i--){
			for(int j=1;j<=n-i;j++){
				System.out.print("   ");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print(" "+c+" ");
			}
			System.out.println();
		}
	}

	static void hallowDiamond() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=sc.nextInt(); 
		System.out.print("Enter Symbol : ");

		char c = sc.next().charAt(0);

		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= n + 1 - i; j++) {
				System.out.print(" "+c+" ");
			}
			for (int k = 1; k < (2*i - 1); k++) {
				System.out.print("   ");
			}
			for (int j = 1; j <= n + 1 - i; j++) {
				System.out.print(" "+c+" ");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--){
			for (int j = n; j >= i; j--) {
				System.out.print(" "+c+" ");
			}
			for (int k = 1; k < (2*i - 1); k++) {
				System.out.print("   ");
			}
			for (int j = n; j >= i; j--) {
				System.out.print(" "+c+" ");
			}
			System.out.println();
		}
	}
	
	public static void leftHalfDiamond() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=sc.nextInt(); 
		System.out.print("Enter Symbol : ");

		char c = sc.next().charAt(0);
		
		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= n - i; j++) {
				System.out.print("   ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" "+c+" ");
			}
			System.out.print(System.lineSeparator());
		}
		// Print lower half
		for (int i = 2; i <= n; i++){
			for (int j = 1; j < i; j++) {
				System.out.print("   ");
			}
			for (int k = i; k <= n; k++) {
				System.out.print(" "+c+" ");
			}
			System.out.print(System.lineSeparator());
		}
	}
	
	public static void rightHalfDiamond() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=sc.nextInt(); 
		System.out.print("Enter Symbol : ");
		
		char c = sc.next().charAt(0);
		
		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= i; j++) {
				System.out.print(" "+c+" ");
			}
			System.out.print(System.lineSeparator());
		}
		// Print lower half
		for (int i = n - 1; i >= 1; i--){
			for (int j = 1; j <= i; j++) {
				System.out.print(" "+c+" ");
			}
			System.out.print(System.lineSeparator());
		}
	}
	

}



