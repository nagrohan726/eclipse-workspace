public class ForLoopDemo {

	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
		}

		System.out.println("===========");

		for (int j = 20; j >= 1; j--) {

			if (j == 10) {
				break;
			}

			System.out.println(j);

		}
	}

}
