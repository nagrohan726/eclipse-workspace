package serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6108217029028360637L;

	int id;
	String name;
	double salary;
	transient int ssn; // in real-time applications this would ideally be re-read from the DB with ID

	public Employee(int id, String name, double salary, int ssn) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}

}
