package abstraction;

public class Test {

	public static void main(String[] args) {

		TouchScreenLaptop laptop = new HPNotebook();
		laptop.scroll();
		laptop.click();

		TouchScreenLaptop laptop2 = new DELLNotebook();
		laptop2.scroll();
		laptop2.click();
	}

}
