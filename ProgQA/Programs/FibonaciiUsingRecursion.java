package Programs;

public class FibonaciiUsingRecursion {
	static int n1=0, n2=1;
	public static void main(String[] args) {
		int n = 10;
		fibonaciiFinder(n);
	}
	
	public static void fibonaciiFinder(int n) {
		if (n>0) {
			System.out.print(n1+" ");
			int n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			fibonaciiFinder(n-1);
		}
	}
	
}
