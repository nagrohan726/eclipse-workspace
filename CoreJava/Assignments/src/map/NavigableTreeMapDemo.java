package map;

import java.util.TreeMap;

public class NavigableTreeMapDemo {

	public static void main(String[] args) {

		TreeMap<String, String> map = new TreeMap<>();

		map.put("c", "cat");
		map.put("z", "zebra");
		map.put("d", "donkey");
		map.put("a", "apple");
		map.put("b", "boAt");

		System.out.println(map);

		System.out.println(map.ceilingKey("d"));
		System.out.println(map.higherKey("b"));
		System.out.println(map.floorKey("c"));
		System.out.println(map.lowerKey("b"));
		System.out.println(map.pollFirstEntry());
		System.out.println(map);
		System.out.println(map.pollLastEntry());
		System.out.println(map);
		System.out.println(map.descendingMap());
		System.out.println(map);

//		Iterator<String> itr = map.descendingKeySet().iterator();
//
//		while (itr.hasNext()) {
//			String s = itr.next();
//			System.out.print(s + "=");
//			System.out.println(map.get(s));
//		}

	}

}
