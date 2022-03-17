
public class MACBookPro extends MACBook {

	@Override
	public void start() {
		System.out.println("Inside MacBookPro's start()");
	}

	@Override
	public void shutdown() {
		System.out.println("Inside MacBookPro's shutdown()");
	}

	public void prosmethod() {
		System.out.println("Inside MacBookPro's prosmethod()");
	}
}
