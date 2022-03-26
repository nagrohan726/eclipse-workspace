package objectmethods;

public class ElectricityBill {

	private int meterNo;
	private String name;
	private String address;

	public int getMeterNo() {
		return meterNo;
	}

	public void setMeterNo(int meterNo) {
		this.meterNo = meterNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ElectricityBill [meterNo=" + meterNo + ", name=" + name + ", address=" + address + "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(address, meterNo, name);
//	}

	@Override
	public int hashCode() {
		return meterNo;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		ElectricityBill other = (ElectricityBill) obj;
//		return Objects.equals(address, other.address) && meterNo == other.meterNo && Objects.equals(name, other.name);
//	}

	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		ElectricityBill other = (ElectricityBill) obj;
		return meterNo == other.meterNo;
	}

}
