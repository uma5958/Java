package OOPConceptPart3;

public abstract class Shape {
	
	// Can't create of object of Abstract class like Interface
	
	Shape(){
		System.out.println("Shape class constructor");
	}
	
	int color;
	
	abstract void drawing();
	
	public void fill() {
		System.out.println("Shape - fill");
	}
}
