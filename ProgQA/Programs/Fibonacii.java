package Programs;

public class Fibonacii {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n = 10;
		for (int i = 1; i <= n; i++) {
			System.out.print(n1+" ");
			int n3 = n1+n2;
			n1 = n2;
			n2 = n3;
		}
	}

}
