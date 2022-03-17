package com.rohan.interfaces;

public class MyCircle implements Circle, Circle2 {

	public static void main(String[] args) {

	}

	@Override
	public void calculateArea() {
//		pi = 3.145f;
		System.out.println(Circle.pi);
	}

	@Override
	public void calculateArea(float radius) {
		System.out.println(Circle2.pi);
	}
}
