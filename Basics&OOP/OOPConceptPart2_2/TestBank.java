package OOPConceptPart2_2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		HSBCBank hs = new HSBCBank();
		hs.credit(); // HSBC - credit
		hs.debit(); // HSBC - debit
		hs.transfetMoney(); // HSBC - Transfer money
		hs.educationLoan(); // HSBC - education loan
		hs.carLoan(); // HSBC - car loan
		
		// Dynamic Polymorphism: Child class object can be referred by parent Interface reference variable
		USBank b = new HSBCBank();
		b.credit(); // HSBC - credit
		b.debit(); // HSBC - debit
		b.transfetMoney(); // HSBC - Transfer money
		
	}

}
