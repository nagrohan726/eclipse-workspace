package implementsrunnable;

public class ChequeProcessor implements Runnable {
	
	public static void main(String[] args) {

		ChequeProcessor cp = new ChequeProcessor();
		
		Thread t = new Thread(cp);
		t.start();
	}

	@Override
	public void run() {
		System.out.println("Processed the cheques");
	}

}
