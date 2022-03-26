
public class Test {

	public static void main(String[] args) {

		Passenger passenger = new Passenger();
		passenger.setId(123);
		passenger.setFirstName("Rohan");
		passenger.setLastName("Nag");

//		System.out.println(passenger);
//		System.out.println(passenger.hashCode());

		Passenger passenger2 = new Passenger();
		passenger2.setId(123);
		passenger2.setFirstName("Rohan");
//		passenger2.setLastName("Nag");
		passenger2.setLastName("Nagesh");

		System.out.println(passenger.equals(passenger2));

	}

}
