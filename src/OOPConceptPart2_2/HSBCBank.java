package OOPConceptPart2_2;

public class HSBCBank implements USBank, BrazilBank {
	
	/**
	 * -> Is-a relationship
	 * -> If a class is implementing interface, then it is mandatory to override/define all methods of interface
	 */
	
	// overriding from BrazilBank
	public void mutualFund() {
		System.out.println("HSBC - mutualfund");
	}

	// Overriding from USBank
	public void credit() {
		System.out.println("HSBC - credit");
	}

	// overriding from USBank
	public void debit() {
		System.out.println("HSBC - debit");
	}

	// overriding from USBank
	public void transfetMoney() {
		System.out.println("HSBC - transfet money");
	}
	
	// Local/separate methods/local methods of HSBCBank class
	public void educationLoan() {
		System.out.println("HSBC - education loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC - car loan");
	}
}
