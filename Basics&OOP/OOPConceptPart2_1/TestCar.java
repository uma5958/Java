package OOPConceptPart2_1;

public class TestCar {

	public static void main(String[] args) {
		
		// static polymorphism or compile time polymorphism
		BMW b = new BMW();
		b.start(); // BMW - start
		b.stop(); // Car - stop
		b.refuel(); // Car - refuel
		b.theftSafety(); // BMW - TheftSafety
		b.engine(); // Vehicle - engine
		
		System.out.println("***********************");
		
		Car c = new Car();
		c.start(); // Car - start
		c.stop(); // Car - stop
		c.refuel(); // Car - refuel
		
		System.out.println("***********************");
		
		// Dynamic polymorphism or Run-time polymorphism - Child class object can be refered by parent by parent class reference variable
		// When we use Dynamic polymorphism overridden methods in child class can be accessed in all parents.
		// Up casting or Top casting
		Car c1 = new BMW();
		c1.start(); // BMW - start 
		c1.stop(); // Car - stop
		c1.refuel(); // Car refuel
		
		System.out.println("***********************");
		
		// Down casting 
		BMW b1 = (BMW) new Car(); // If we don't cast - ClassCastException
		b1.start(); 
		b1.stop();
	}

}
