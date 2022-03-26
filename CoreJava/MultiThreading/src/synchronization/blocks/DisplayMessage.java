package synchronization.blocks;

public class DisplayMessage {

	public void sayHello(String name) {
		// Any code can go here

//		synchronized (DisplayMessage.class) {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println("How are you, " + name);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
