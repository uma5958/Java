package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		System.out.println("ABC");
		
		try {
			throw new Exception("Naveen Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("PQR");
		
		String exec_flag = " ";
		if (exec_flag.equals(" ")) {
			try {
				throw new Exception("Exception flag is blank Exception");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Test");
	}
}

/**
 * To customize the exception we use the throws keyword
 */

