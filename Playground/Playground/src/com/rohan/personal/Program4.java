package com.rohan.personal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program4 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 23, 345, 12, 56, 100, 201, 158));

//		list1.stream().filter(i -> Integer.toString(i).charAt(0) == '1').forEach(i -> System.out.println(i));

		System.out.println("Second Largest: " + Program4.secondLargest(list1));

	}

	static int secondLargest(List<Integer> list) {

		int max = 0, second = 0;
		for (int item : list) {

			if (max < item) {
				second = max;
				max = item;
			} else if (second < item) {
				second = item;
			}

		}

		return second;

	}

}
