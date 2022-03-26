package encapsulation;

public class Test {

	public static void main(String[] args) {

		Patient p = new Patient();

		p.setId(1);
		p.setName("Mittal");
		p.setSsn("s123");

		System.out.println("ID: " + p.getId());
		System.out.println("Name: " + p.getName());
		System.out.println("SSN: " + p.getSsn());
	}

}
