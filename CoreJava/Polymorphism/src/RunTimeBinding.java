
public class RunTimeBinding {

	public static void main(String[] args) {

		AppleLaptop m1 = new MACBookPro(); // up-casting / byte to int / float to double
		AppleLaptop m2 = new MACBookAir();

		m1.start();
		m1.shutdown();
//		m1.prosmethod(); 	// not available

		MACBookPro m3 = (MACBookPro) m1;
		m3.prosmethod();

		m2.start();
		m2.shutdown();

		MACBookAir m4 = (MACBookAir) m2;
	}

}
