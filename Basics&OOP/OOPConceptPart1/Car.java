package OOPConceptPart1;

public class Car {
	// Class variables
	int modal;
	int wheel;
	
	public static void main(String[] args) {
		// new Car(); -> This is Object of Car Class
		// new keyword is used to create the object 
		// a, b, c -> Object reference variables
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.modal = 2015;
		a.wheel = 4;
		
		b.modal = 2014;
		b.wheel = 4;
		
		c.modal = 2013;
		c.wheel = 4;
		
		System.out.println("A - Modal: "+a.modal);
		System.out.println("A - Wheel: "+a.wheel);
		System.out.println("B - Modal: "+b.modal);
		System.out.println("B - Wheel: "+b.wheel);
		System.out.println("C - Modal: "+c.modal);
		System.out.println("C - Wheel: "+c.wheel);
		
		// Shifting Object References 
		System.out.println("====================");
		
		Car x = new Car();
		Car y = new Car();
		Car z = new Car();
		
		x = y;
		y = z;
		z = x;
		
		x.modal = 2018;
		System.out.println("X - Modal:"+x.modal); // 2018
		z.modal = 2020;
		System.out.println("X - Modal:"+x.modal); // 2020
		System.out.println("Z - Modal:"+z.modal); // 2020
	}

}
