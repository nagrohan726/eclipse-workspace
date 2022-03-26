package concurrentcollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class ArraySetProblem extends Thread {

//	static HashSet<String> courses = new HashSet<String>();
	static CopyOnWriteArraySet<String> courses = new CopyOnWriteArraySet<>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courses.add("Kubernetes");
	}

	public static void main(String[] args) throws InterruptedException {

		ArraySetProblem arrayListProblem = new ArraySetProblem();
		arrayListProblem.start();

		courses.add("Java");
		courses.add("Python");
		courses.add("AWS");
		courses.add("Docker");

		Iterator<String> iterator = courses.iterator();

		while (iterator.hasNext()) {
			Thread.sleep(2000);
			String course = iterator.next();
			System.out.println(course);
//			if (course.equals("Docker")) {
//				courses.remove(course);
//			}
//			courses.add("Node"); 
		}

		System.out.println(courses);

	}

}
