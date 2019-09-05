package OOPConceptPart1;

public class MethodOverloading {
	/**
	 * Method overloading - When the method name is same with different arguments or input parameters within the same class
	 * -> methods can be differed by type of arguments, no.of arguments, order of arguments  
	 * -> we can overload main method also 
	 * -> you can't create method inside a method
	 * -> duplicate methods i.e same method name with same no.of args not allowed
	 */
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
	}

	public static void main(int p) {

	}

	public static void main(int q, int r) {

	}
	
	public void sum() { // 0 i/p parameters 
		System.out.println("sum method - zero parameters");
	}
	
	public void sum(double d) { // 1 i/p parameters 
		System.out.println("sum method - 1 input parameters");
	}
	
	public void sum(int i) { // 1 i/p parameters 
		System.out.println("sum method - 1 input parameters");
		System.out.println(i);
	}
	
	public void sum(int k, int l) { // 2 i/p parameters 
		System.out.println("sum method - 2 input parameters");
		System.out.println(k+l);
	}
	
}
