package OOPConceptPart1;

public class LocalVsGlobalVariables {
	// Global variables or class variables 
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		int i = 10; // local variables for main method
		System.out.println("Local vars: "+i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println("Global: "+obj.name);
		System.out.println("Global: "+obj.age);
	}
	
	public void sum() {
		// local variables for sum method
		int i = 15;
		int j = 20;
	}
}
