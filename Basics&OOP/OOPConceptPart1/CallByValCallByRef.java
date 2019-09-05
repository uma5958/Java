package OOPConceptPart1;

public class CallByValCallByRef {
	
	int p;
	int q;
	
	public static void main(String[] args) {
		CallByValCallByRef obj = new CallByValCallByRef();
		int x = 10;
		int y = 20;
		obj.testSum(x, y); // Call by value or pass by value
		
		obj.p = 50;
		obj.q = 60;
		obj.swap(obj); // Call by reference 
		// After swap
		System.out.println(obj.p); // 60
		System.out.println(obj.q); // 50
	}
	
	
	public int testSum(int a, int b) {
		a = 30;
		b = 40;
		int c = a+b;
		return c;
	}
	
	public void swap(CallByValCallByRef t) {
		int temp;
		temp = t.p; // temp = 50
		t.p = t.q; // t.p = 60
		t.q = temp; //t.q = 50
	}

}
