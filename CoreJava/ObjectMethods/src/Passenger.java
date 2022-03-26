
public class Passenger {

	private int id;
	private String firstName;
	private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Passenger Information is\nFirst Name: " + this.firstName + "\nLast Name: " + this.lastName;
	}

	@Override
	public int hashCode() {
//		return id;
		return id + firstName.length() + lastName.length();
	}

	@Override
	public boolean equals(Object obj) { // Can't change parameter to specific type as parent implements its method with
										// Object
		Passenger passenger = (Passenger) obj;

		if (passenger.getId() == this.id && passenger.getFirstName().equals(this.firstName)
				&& passenger.getLastName().equals(this.lastName)) {
			return true;
		}

		return false;

	}
}
