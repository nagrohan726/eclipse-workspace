package comparator;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int l1 = o1.length();
		int l2 = o2.length();

//		return (l1 < l2) ? -1 : ((l1 > l2) ? 1 : o1.compareTo(o2));
		return (l1 < l2) ? 1 : ((l1 > l2) ? -1 : o1.compareTo(o2));
	}

}
