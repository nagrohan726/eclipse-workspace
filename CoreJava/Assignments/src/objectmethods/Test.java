package objectmethods;

public class Test {

	public static void main(String[] args) {

		ElectricityBill bill = new ElectricityBill();

		bill.setMeterNo(123);
		bill.setName("Rohan");
		bill.setAddress("India Home");

		ElectricityBill bill2 = new ElectricityBill();

		bill2.setMeterNo(123);
		bill2.setName("Rohan");
		bill2.setAddress("India Home");

		System.out.println(bill);
		System.out.println(bill.equals(bill2));
		System.out.println(bill.hashCode());

	}

}
