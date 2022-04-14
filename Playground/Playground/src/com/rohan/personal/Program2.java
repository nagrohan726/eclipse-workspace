package com.rohan.personal;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		for (int i = list.size() - 1; i >= 0; i--)
			System.out.println(list.get(i));

//		int a = 10;
//		int b = a + 10;
//		
//		a = 20;

	}

}
