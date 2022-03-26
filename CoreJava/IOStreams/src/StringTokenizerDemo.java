
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		String s = "You are the creator of your destiny";
		String s2 = "You,are,the,creator,of,your,destiny";

		StringTokenizer st = new StringTokenizer(s);
		StringTokenizer st2 = new StringTokenizer(s2, ",");
		StringTokenizer st3 = new StringTokenizer(s2, ",", true); // returns the delimiters as well

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}

		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
	}

}
