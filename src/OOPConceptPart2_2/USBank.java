package OOPConceptPart2_2;

public interface USBank {
	
	/**
	 * -> Only method declaration
	 * -> No method body - only method prototype 
	 * -> In Interface we can declare variables, variables are by default static in nature
	 * -> Variables will not be changed, it's final/constant in nature 
	 * -> No static method in interface 
	 * -> No main method in interface 
	 * -> We can't create the object of interface
	 * -> Interface is abstract in nature 
	 * -> Abstraction - 100%
	 */
	
	int min_bal = 100;
	public void credit();
	public void debit();
	public void transfetMoney();
	
}
