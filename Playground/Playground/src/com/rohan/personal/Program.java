package com.rohan.personal;

import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {

		String s = "a,b,c,x,a,y,b,z,c,m,a,n,b,o,c,d,b,c,a,d,a";

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		System.out.println(map);

	}

}
