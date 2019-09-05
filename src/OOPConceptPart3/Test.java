package OOPConceptPart3;

public class Test extends Shape {
	
	Test(){
		System.out.println("Test class constuctor");
	}

	public static void main(String[] args) {
		/**
		 * -> Whenever we create the object of inherited class of abstract class, 
		 * 	  abstract class constructor will be called first.
		 * 	  (or)
		 * -> Parent abstract class constructor will be called when child class object is created.
		 * 	  (or)
		 * -> Whenever the constructor of abstract class created will be called when object of 
		 * 	  child class created. 
		 */
		
		Shape s = new Test();
		s.drawing(); // Test - drawing
		s.fill(); // Shape - fill
		
		System.out.println("*******************");
		
		Test t = new Test();
		t.drawing();
		// t.shape(); // not visible for Test class
	}

	@Override
	void drawing() {
		System.out.println("Test - drawing");
	}

}
