

public class StringMethods {

	public static void main(String[] args) {

		String s = "Hello";
		String s2 = s.concat(" World");

		System.out.println("Length of the string is: " + s.length());
		System.out.println("indexOf: " + s.indexOf('o'));
		System.out.println("indexOf: " + s.indexOf('l')); // returns the first occurrence
		System.out.println("charAt: " + s.charAt(3));

		System.out.println("Substring with beginning index: " + s.substring(2));
		System.out.println("Substring with begin and end index: " + s.substring(1, 3));

		String[] result = s2.split(" ");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

		System.out.println("replace: " + s2.replace('l', 'k'));
		System.out.println("toUpperCase: " + s2.toUpperCase());
		System.out.println("toLowerCase: " + s2.toLowerCase());

//		s2.		// press ctrl + space and check all available methods

	}
}
