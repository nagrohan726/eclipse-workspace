

public class SwitchDemo {

	public static void main(String[] args) {

//		int x = 1;
		int x = 3;

		switch (x) {

		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		case 3:
		case 4:
			System.out.println("Common logic");
			break;
		default:
			System.out.println("Default");
		}
	}

}
