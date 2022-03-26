package serialization;

import java.io.Serializable;

public class Employee implements Serializable {

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
