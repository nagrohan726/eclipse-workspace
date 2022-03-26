package threadgroups;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName()); // main
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName()); // system
//		System.out.println(Thread.currentThread().getThreadGroup().getParent().getParent().getName());	// nothing beyond system

		ThreadGroup parent = new ThreadGroup("Parent");
		System.out.println(parent.getName());

		ThreadGroup child = new ThreadGroup(parent, "Child");
		System.out.println(child.getName());
		System.out.println(child.getParent().getName());

		Thread thread1 = new Thread(child, "Thread 1");
		Thread thread2 = new Thread(child, "Thread 2");
		System.out.println(thread1.getThreadGroup().getName());
		System.out.println(thread1.getPriority());
		child.setMaxPriority(4);
		System.out.println(thread1.getPriority());
		Thread thread3 = new Thread(child, "Thread 3");
		System.out.println(thread3.getPriority());

	}
}
