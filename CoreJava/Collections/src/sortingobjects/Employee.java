package sortingobjects;

public class Employee implements Comparable<Employee> {

	int id;
	String name;

	public Employee(int id, String name) {
//		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		int id1 = this.id;
		int id2 = o.id;

		return (id1 < id2) ? -1 : (id1 > id2) ? 1 : 0;
	}

}
