
public class StringParser {

	public static void main(String[] args) {

		try {
			String s = "abcd";
			int i = Integer.parseInt(s);
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println("Please enter a valid number");
		}
	}
}
