package Programs;

public class MissingNumber {
	// To do this elements should be in sorted order
	
	public static void main(String[] args) {
		int a[] = {-1, 0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
		
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		
		int sum1=0;
		for (int i = -1; i <= 10; i++) {
			sum1=sum1+i;
		}
		
		System.out.println("Missing number is: "+(sum1-sum));
	}

}
