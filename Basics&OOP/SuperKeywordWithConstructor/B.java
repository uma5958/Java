package SuperKeywordWithConstructor;

public class B extends A {
	/**
	 * -> Super() is used to call the parent class constructor 
	 * -> Not allowed to have multiple super keywords in one constructor
	 * -> Super keyword must be the first statement in the constructor 
	 */
	
	public B() {
		super();
		// super(i);
		// super(i, j);
	}

	public B(int i) {
		super(i);
	}

	public B(int i, int j) {
		super(i, j);
	}

	public static void main(String[] args) {
		B obj = new B(); // Default constructor will be called
		B obj1 = new B(10); // 1 arg constructor will be called
		B obj2 = new B(10, 20); // 2 arg constructor will be called
	}

}
