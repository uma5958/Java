package OOPConceptPart3;

public class Dog extends Animal {
	// We can access non-abstract methods in abstract class in child class by child class object
	public static void main(String[] args) {
		Dog d = new Dog();
		d.cat();
	}

}
