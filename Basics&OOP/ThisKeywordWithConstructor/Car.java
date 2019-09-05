package ThisKeywordWithConstructor;

public class Car {
	String name;
	String modalNumber;
	int price;
	String engine;
	
	public Car(String name, String modalNumber, int price, String engine) {
		this.name = name;
		this.modalNumber = modalNumber;
		this.price = price;
		this.engine = engine;
	}

	public static void main(String[] args) {
		Car obj1 = new Car("BMW", "320d", 10, "Automatic");
		Car obj2 = new Car("Audi", "A8", 25, "Automatic");
		Car obj3 = new Car("Honda", "City", 5, "Manual");
		
		System.out.println(obj1.name +" " + obj1.modalNumber +" "+ obj1.price +" "+ obj1.engine);
		System.out.println(obj2.name +" " + obj2.modalNumber +" "+ obj2.price +" "+ obj2.engine);
		System.out.println(obj3.name +" " + obj3.modalNumber +" "+ obj3.price +" "+ obj3.engine);
	}

}
