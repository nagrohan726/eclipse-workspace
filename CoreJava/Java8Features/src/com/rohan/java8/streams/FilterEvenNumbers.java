package com.rohan.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {
			l1.add(i);
		}

		System.out.println(l1);

//		List<Integer> l2 = new ArrayList<>();
//		for (Integer i : l1) {
//			if (i % 2 == 0) {
//				l2.add(i);
//			}
//		}

		List<Integer> l2 = l1.stream().filter(i -> (i % 2 == 0)).collect(Collectors.toList());

		System.out.println(l2);

//		String s = "My name is Anthony Gonsalves";
//
//		List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
//
//		String input = s.toLowerCase();
//		int count = 0;
//
//		count = (int) input.chars().filter(c -> vowels.contains((char) c)).count();
//
//		System.out.println(input + ": " + count);

		long count = l1.stream().filter(i -> (i % 2 == 0)).count();
		System.out.println("Number of even numbers are: " + count);

//		Comparator<Integer> comp = (i1, i2) -> i2.compareTo(i1);
		Comparator<Integer> comp2 = (i1, i2) -> i1.compareTo(i2);

//		List<Integer> l3 = l1.stream().sorted(new EvenNumberComparator()).collect(Collectors.toList());
//		List<Integer> l3 = l1.stream().sorted(comp).collect(Collectors.toList());
		List<Integer> l3 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println(l3);

		Integer max = l1.stream().max(comp2).get();
		Integer min = l1.stream().min(comp2).get();

		System.out.println(max);
		System.out.println(min);

		l1.stream().forEach(i -> System.out.println(i));

	}

}
