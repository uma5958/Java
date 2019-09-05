package OOPConceptPart1;

public class StaticAndNonStaticConcept {

	// Global vars: The scope of global variables will be available across all the functions with some condition 
	String name = "Tom"; // non-static global variable
	static int age = 25; // static global variable
	
	public static void main(String[] args) {
		// How to call static methods and vars:
		// 1. Direct calling 
		sum();
		
		// Call by class name
		StaticAndNonStaticConcept.sum();
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		// How to call non-static methods and vars:
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		// Can I access static method by using object reference ? Yes
		obj.sum(); // Waring will be given - static method should be accessed in static way 
	}
	
	
	public void sendMail() { // non-static method
		System.out.println("Send ail method");
	}
	
	public static void sum() { // static method 
		System.out.println("Sum method");
	}

}
