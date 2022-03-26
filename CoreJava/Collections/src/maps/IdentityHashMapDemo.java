package maps;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args) {

//		Map<Integer, String> map = new HashMap<>();		// uses equals operator
		Map<Integer, String> map = new IdentityHashMap<>(); // uses == operator

		Integer id1 = new Integer(10);
		Integer id2 = new Integer(10);

		map.put(id1, "Rohan");
		map.put(id2, "Sarath");

		System.out.println(map);

	}

}
