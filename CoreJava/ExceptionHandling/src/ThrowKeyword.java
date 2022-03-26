
public class ThrowKeyword {

	public static void main(String[] args) {

//		throw new RuntimeException("Funds not available");
		try {
			throw new Exception("Funds not available"); // includes checked exceptions that need to be handled
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
