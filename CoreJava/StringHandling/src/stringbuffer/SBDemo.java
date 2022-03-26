package stringbuffer;

public class SBDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer(); // not immutable
		System.out.println("Initial Capacity: " + sb.capacity());

		sb.append("All the power is within you."); // so no need to assign
		sb.append("You can do anything and everything."); // sb will mutate to the new change

		System.out.println(sb);

		System.out.println("Current capacity: " + sb.capacity());

		System.out.println("charAt: " + sb.charAt(10));

		StringBuffer sb1 = new StringBuffer("abcde");
		System.out.println(sb1.reverse());

		System.out.println(sb1.insert(3, "xyz"));
		System.out.println(sb1.delete(3, 6)); // from (starting 0) - upto before

//		sb1.	// press ctrl + space and check all available methods

	}

}
