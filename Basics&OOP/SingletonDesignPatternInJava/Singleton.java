package SingletonDesignPatternInJava;

public class Singleton {
	/**
	 * -> Singleton class - Class can have only one object(instance of class) at a time
	 * -> How to Design singleton class:
	 *    1) Make constructor as private
	 *    2) Write a public static method(getInstance) that has return type of object of this singleton class
	 * -> Diff b/w normal class & singleton class: For normal class we use constructor where as for 
	 *    singleton class we use getInstance() method for instantiation
	 */
	
	private static Singleton singleton_instance = null;
	public String str;
	
	private Singleton() {
		str = "Hey I am using singleton class pattern";
	}
	
	public static Singleton getInstance() {
		if (singleton_instance == null) {
			singleton_instance = new Singleton();
		}
		return singleton_instance;
	}

	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.str = (x.str).toUpperCase();
		System.out.println(x.str); // HEY I AM USING SINGLETON CLASS PATTERN
		System.out.println(y.str); // HEY I AM USING SINGLETON CLASS PATTERN
		System.out.println(z.str); // HEY I AM USING SINGLETON CLASS PATTERN
		
		z.str = (z.str).toLowerCase();
		System.out.println(x.str); // hey i am using singleton class pattern
		System.out.println(y.str); // hey i am using singleton class pattern
		System.out.println(z.str); // hey i am using singleton class pattern
	}

}
