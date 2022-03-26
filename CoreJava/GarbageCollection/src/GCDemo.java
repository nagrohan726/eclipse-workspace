
public class GCDemo {

	int objId;

	public GCDemo() {
		System.out.println(this + " Created");
	}

	public GCDemo(int objId) {
		this.objId = objId;
		System.out.println("Created " + objId);
	}

	public static void main(String[] args) {

//		new GCDemo();
//		new GCDemo();

//		System.gc();

//		for (int i = 1; i <= 500000; i++) {
//			new GCDemo(i);
//		}

		new GCDemo(1);
		new GCDemo(2);

		for (int i = 1; i <= 100; i++) {
			System.gc();
		}

	}

	@Override
	protected void finalize() {
//		System.out.println(this + " Finalized");
		System.out.println("Finalized " + objId);
	}

}
