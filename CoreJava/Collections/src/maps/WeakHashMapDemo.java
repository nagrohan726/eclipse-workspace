package maps;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {

//		Map<User, String> map = new HashMap<>();	// does not check the content of the map
		Map<User, String> map = new WeakHashMap<>(); // checks that the content of the map is not null

		User u = new User();
		map.put(u, "Tom");

		System.out.println(map);

		u = null;

		System.gc();
		Thread.sleep(5000);

		System.out.println(map);

	}

}
