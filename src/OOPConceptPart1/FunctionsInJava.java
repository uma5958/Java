package OOPConceptPart1;

public class FunctionsInJava {

	// main method -> starting point of execution 
	public static void main(String[] args) {
		FunctionsInJava obj =  new FunctionsInJava();
		// one object will be created, obj is the reference variable, referring to this object
		// after creating object, the copy of non-static methods will be given to this object
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println("pqr o/p: "+l);
		
		String s1 = obj.qa();
		System.out.println("qa o/p: "+s1);
		
		int div = obj.division(30, 10);
		System.out.println("div o/p: "+ div);
		
		// main method is void - never returns any value
	}
	
	// Non-static methods 
	// void doesn't return any value 
	// return type = void 
	public void test() {   // No input, no output 
		System.out.println("Test method");
	}
	
	// return type = int
	public int pqr() {    // No input, some output
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
	
	// return type = String 
	public String qa() {   // No input, some output 
		System.out.println("qa method");
		String s = "Selenium";
		return s;
	}

	// return type = int 
	// x, y -> input parameters/arguments 
	public int division(int x, int y) {   // Some input, some output
		System.out.println("Division method");
		int d = x/y;
		return d;
	}
	
}
