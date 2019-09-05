package ThisKeywordWithConstructor;

public class ConstructorConcept {
	// Class vars or instance vars
	String name;
	int age;
	
	public ConstructorConcept() { // 0 parameter
		System.out.println("Default constructor");
	}
	
	public ConstructorConcept(int i) { // 1 parameter
		System.out.println("1 parameter constructor");
	}
	
	public ConstructorConcept(int i, int j) { // 2 parameter
		System.out.println("2 parameter constructor");
	}
	
	public ConstructorConcept(String name, int age) { 
		this.name = name;
		this.age = age;
		
		// without this keyword
		//name = name1;
		//age = age1;
	}
	
	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10, 20);
		ConstructorConcept obj3 = new ConstructorConcept("Tom", 25);
		
		System.out.println(obj3.name);
		System.out.println(obj3.age);
	}

}
