package OOPConceptPart2_1;

public class BMW extends Car {
	
	/**
	 * When same method present in parent class as well as in child class 
	 * with same name and same no.of arguments is called Method-overriding 
	 */
	
	public void start() { // Overridden method
		System.out.println("BMW - start");
	}
	
	public void theftSafety() {
		System.out.println("BMW - TheftSafety");
	}
}
